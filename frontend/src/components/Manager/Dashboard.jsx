import React from "react";

export default function Dashboard() {
    return (
        <div>
            <h2 className="mb-4">Manager Dashboard</h2>

            <div className="row g-4">

                <div className="col-md-3">
                    <div className="card shadow-sm border-0 text-center">
                        <div className="card-body">
                            <h5>Projects</h5>
                            <h2 className="text-primary">12</h2>
                            <p className="text-muted">
                                Active Projects
                            </p>
                        </div>
                    </div>
                </div>

                <div className="col-md-3">
                    <div className="card shadow-sm border-0 text-center">
                        <div className="card-body">
                            <h5>Employees</h5>
                            <h2 className="text-success">48</h2>
                            <p className="text-muted">
                                Assigned Employees
                            </p>
                        </div>
                    </div>
                </div>

                <div className="col-md-3">
                    <div className="card shadow-sm border-0 text-center">
                        <div className="card-body">
                            <h5>Tasks</h5>
                            <h2 className="text-warning">95</h2>
                            <p className="text-muted">
                                Pending Tasks
                            </p>
                        </div>
                    </div>
                </div>

                <div className="col-md-3">
                    <div className="card shadow-sm border-0 text-center">
                        <div className="card-body">
                            <h5>Completed</h5>
                            <h2 className="text-danger">76</h2>
                            <p className="text-muted">
                                Completed Tasks
                            </p>
                        </div>
                    </div>
                </div>

            </div>

            <div className="row mt-5">

                <div className="col-md-8">
                    <div className="card shadow-sm border-0">
                        <div className="card-body">
                            <h4>Recent Projects</h4>

                            <table className="table table-hover mt-3">
                                <thead>
                                    <tr>
                                        <th>Project Name</th>
                                        <th>Status</th>
                                        <th>Team Size</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <tr>
                                        <td>Skill-Based Allocation</td>
                                        <td>
                                            <span className="badge bg-success">
                                                Active
                                            </span>
                                        </td>
                                        <td>6</td>
                                    </tr>

                                    <tr>
                                        <td>Inventory System</td>
                                        <td>
                                            <span className="badge bg-warning text-dark">
                                                In Progress
                                            </span>
                                        </td>
                                        <td>4</td>
                                    </tr>

                                    <tr>
                                        <td>CRM Portal</td>
                                        <td>
                                            <span className="badge bg-primary">
                                                Planning
                                            </span>
                                        </td>
                                        <td>3</td>
                                    </tr>
                                </tbody>

                            </table>
                        </div>
                    </div>
                </div>

                <div className="col-md-4">
                    <div className="card shadow-sm border-0">
                        <div className="card-body">
                            <h4>Quick Actions</h4>

                            <div className="d-grid gap-2 mt-3">
                                <button className="btn btn-primary">
                                    Create Project
                                </button>

                                <button className="btn btn-success">
                                    Search Employees
                                </button>

                                <button className="btn btn-warning">
                                    Assign Team
                                </button>

                                <button className="btn btn-info text-white">
                                    Generate Report
                                </button>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    );
}