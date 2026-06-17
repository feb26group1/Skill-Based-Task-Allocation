import { useState } from "react";
import { useDispatch } from "react-redux";
import { loginSuccess } from "../redux/authSlice";
import { useNavigate } from "react-router-dom";

export default function LoginComp() {

    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [message, setMessage] = useState("");

    const dispatch = useDispatch();
    const navigate = useNavigate();

    const handleSubmit = async (e) => {
        e.preventDefault();

        try {

            const response = await fetch(
                "http://localhost:9000/login",
                {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json",
                    },
                    body: JSON.stringify({
                        username,
                        password,
                    }),
                }
            );

            if (response.status === 404) {
                setMessage("Wrong Credentials");
                return;
            }

            const data = await response.json();

            console.log(data);

            dispatch(
                loginSuccess({
                    user: data.user,
                    token: data.token,
                })
            );

            setMessage("Login Successful");

            // Role Based Navigation
            if (data.user.role === 1) {
                navigate("/admin");
            }
            else if (data.user.role === 2) {
                navigate("/user");
            }
            else if (data.user.role === 3) {
                navigate("/manager");
            }
            else {
                setMessage("Invalid Role");
            }

        } catch (error) {
            console.log(error);
            setMessage("Something Went Wrong");
        }
    };

    return (
        <div className="container mt-5">

            <div className="card shadow p-4">

                <h2 className="mb-4">Login Form</h2>

                <form onSubmit={handleSubmit}>

                    <div className="mb-3">
                        <label className="form-label">
                            Username
                        </label>

                        <input
                            type="text"
                            className="form-control"
                            value={username}
                            onChange={(e) =>
                                setUsername(e.target.value)
                            }
                        />
                    </div>

                    <div className="mb-3">
                        <label className="form-label">
                            Password
                        </label>

                        <input
                            type="password"
                            className="form-control"
                            value={password}
                            onChange={(e) =>
                                setPassword(e.target.value)
                            }
                        />
                    </div>

                    <button
                        type="submit"
                        className="btn btn-primary"
                    >
                        Login
                    </button>

                </form>

                <p className="mt-3">
                    {message}
                </p>

            </div>

        </div>
    );
}