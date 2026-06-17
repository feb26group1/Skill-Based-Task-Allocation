import { NavLink } from "react-router-dom";
import Dashboardoverview from "../components/User/Dashboardoverview";

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

                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                Dashboard
                            </NavLink>
                        </li>

                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                My Tasks
                            </NavLink>
                        </li>

                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                My Projects
                            </NavLink>
                        </li>

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

                    </ul>
                </div>

                {/* Main Content */}
                <div className="col-md-9 col-lg-10 bg-light p-4">
                    <Dashboardoverview />
                </div>

            </div>
        </div>
    );
}