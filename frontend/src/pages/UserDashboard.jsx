import { NavLink, Outlet } from "react-router-dom";

export default function UserDashboard() {
    return (
        <div className="container-fluid">
            <div className="row min-vh-100">

                {/* Sidebar */}
                <div
                    className="col-md-3 col-lg-2 bg-dark text-white p-4"
                    style={{ minHeight: "100vh" }}
                >

                    <h3 className="mb-4 text-center">
                        User Panel
                    </h3>

                    <ul className="nav flex-column">

                        {/* Dashboard */}
                        <li className="nav-item mb-2">
                            <NavLink
                                to="/user"
                                end
                                className="nav-link text-white"
                            >
                                Dashboard
                            </NavLink>
                        </li>

                        {/* My Tasks */}
                        <li className="nav-item mb-2">
                            <NavLink
                                to="/user/tasks"
                                className="nav-link text-white"
                            >
                                My Tasks
                            </NavLink>
                        </li>

                        {/* My Projects */}
                        <li className="nav-item mb-2">
                            <NavLink
                                to="/user/projects"
                                className="nav-link text-white"
                            >
                                My Projects
                            </NavLink>
                        </li>

                        {/* Future */}
                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                Skill Profile
                            </NavLink>
                        </li>

                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                Task Status
                            </NavLink>
                        </li>

                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                Performance
                            </NavLink>
                        </li>

                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                Notifications
                            </NavLink>
                        </li>

                        {/* Logout */}
                        <li className="nav-item mt-3">
                            <NavLink
                                to="/logout"
                                className="nav-link text-danger"
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