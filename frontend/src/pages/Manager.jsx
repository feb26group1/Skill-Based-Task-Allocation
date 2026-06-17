import { NavLink } from "react-router-dom";
import Dashboard from "../components/Manager/Dashboard";

export default function ManagerDashboard() {
    return (
        <div className="container-fluid">
            <div className="row min-vh-100">

                {/* Sidebar */}
                <div
                    className="col-md-3 col-lg-2 bg-dark text-white p-4"
                    style={{ minHeight: "100vh" }}
                >
                    <h3 className="mb-4 text-center">
                        Manager Panel
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
                                Project Management
                            </NavLink>
                        </li>

                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                Skill Requirements
                            </NavLink>
                        </li>

                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                Employee Search
                            </NavLink>
                        </li>

                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                Employee Recommendations
                            </NavLink>
                        </li>

                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                Project Assignment
                            </NavLink>
                        </li>

                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                Task Management
                            </NavLink>
                        </li>

                        <li className="nav-item mb-2">
                            <NavLink
                                to="#"
                                className="nav-link text-white"
                            >
                                Reports
                            </NavLink>
                        </li>

                    </ul>
                </div>

                {/* Main Content */}
                <div className="col-md-9 col-lg-10 bg-light p-4">
                    <Dashboard />
                </div>

            </div>
        </div>
    );
}