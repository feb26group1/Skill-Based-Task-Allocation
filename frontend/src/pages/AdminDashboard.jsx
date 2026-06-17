import { NavLink, Outlet } from "react-router-dom";

export default function AdminDashboard() {
    return (
        <div className="container-fluid">
            <div className="row min-vh-100">

                {/* Sidebar */}
                <div
                    className="col-md-3 col-lg-2 text-white p-4"
                    style={{
                        minHeight: "100vh",
                        background:
                            "linear-gradient(180deg, #1f2630 0%, #121821 100%)"
                    }}
                >
                    <h2 className="text-center fw-bold mb-5">
                        Admin Panel
                    </h2>

                    <ul className="nav flex-column">

                        <li className="nav-item mb-3">
                            <NavLink
                                to=""
                                end
                                className="nav-link text-white"
                            >
                                Dashboard
                            </NavLink>
                        </li>

                        <li className="nav-item mb-3">
                            <NavLink
                                to="employees"
                                className="nav-link text-white"
                            >
                                Employees
                            </NavLink>
                        </li>

                        <li className="nav-item mb-3">
                            <NavLink
                                to="managers"
                                className="nav-link text-white"
                            >
                                Managers
                            </NavLink>
                        </li>

                        <li className="nav-item mb-3">
                            <NavLink
                                to="projects"
                                className="nav-link text-white"
                            >
                                Projects
                            </NavLink>
                        </li>

                        <li className="nav-item mb-3">
                            <NavLink
                                to="skills"
                                className="nav-link text-white"
                            >
                                Skills
                            </NavLink>
                        </li>

                        <li className="nav-item mb-3">
                            <NavLink
                                to="reports"
                                className="nav-link text-white"
                            >
                                Reports
                            </NavLink>
                        </li>

                        <li className="nav-item mb-3">
                            <NavLink
                                to="logout"
                                className="nav-link text-white"
                            >
                                Logout
                            </NavLink>
                        </li>

                    </ul>
                </div>

                {/* Main Content */}
                <div className="col-md-9 col-lg-10 bg-light p-4">
                    <Outlet />
                </div>

            </div>
        </div>
    );
}