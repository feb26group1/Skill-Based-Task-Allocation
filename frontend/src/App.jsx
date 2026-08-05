import Home from "./pages/Home";
import LoginComp from "./components/LoginComp";

import UserDashboard from "./pages/UserDashboard";
import AdminDashboard from "./pages/AdminDashboard";
import ManagerDashboard from "./pages/Manager";
import LogOutComp from "./pages/LogOutComp";

import ProtectedRoutes from "./components/ProtectedRoutes";

import AdminHome from "./components/Admin/AdminHome";

import UserHome from "./components/User/UserHome";
import UserTasks from "./components/User/UserTasks";
import UserProjects from "./components/User/UserProjects";

import ManagerHome from "./components/Manager/ManagerHome";

import {
    BrowserRouter,
    Routes,
    Route
} from "react-router-dom";


function App() {

    return (

        <BrowserRouter>

            <Routes>

                {/* ================= PUBLIC ================= */}

                <Route path="/" element={<Home />}>

                    <Route
                        path="login"
                        element={<LoginComp />}
                    />

                    <Route
                        path="register"
                        element={<h2>Register Form</h2>}
                    />

                </Route>


                {/* ================= ADMIN ================= */}

                <Route
                    path="/admin"
                    element={
                        <ProtectedRoutes role={1}>
                            <AdminDashboard />
                        </ProtectedRoutes>
                    }
                >

                    <Route
                        index
                        element={<AdminHome />}
                    />

                    <Route
                        path="logout"
                        element={<LogOutComp />}
                    />

                </Route>


                {/* ================= USER ================= */}

                <Route
                    path="/user"
                    element={
                        <ProtectedRoutes role={2}>
                            <UserDashboard />
                        </ProtectedRoutes>
                    }
                >

                    {/* /user */}
                    <Route
                        index
                        element={<UserHome />}
                    />

                    {/* /user/tasks */}
                    <Route
                        path="tasks"
                        element={<UserTasks />}
                    />

                    {/* /user/projects */}
                    <Route
                        path="projects"
                        element={<UserProjects />}
                    />

                    {/* /user/logout */}
                    <Route
                        path="logout"
                        element={<LogOutComp />}
                    />

                </Route>


                {/* ================= MANAGER ================= */}

                <Route
                    path="/manager"
                    element={
                        <ProtectedRoutes role={3}>
                            <ManagerDashboard />
                        </ProtectedRoutes>
                    }
                >

                    <Route
                        index
                        element={<ManagerHome />}
                    />

                    <Route
                        path="logout"
                        element={<LogOutComp />}
                    />

                </Route>


                {/* ================= COMMON ================= */}

                <Route
                    path="/logout"
                    element={<LogOutComp />}
                />


                {/* ================= UNAUTHORIZED ================= */}

                <Route
                    path="/unauthorized"
                    element={
                        <div className="container mt-5">
                            <h2>
                                Unauthorized Access
                            </h2>

                            <p>
                                You don't have permission
                                to access this page.
                            </p>
                        </div>
                    }
                />

            </Routes>

        </BrowserRouter>
    );
}

export default App;