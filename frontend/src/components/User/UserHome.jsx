import React from "react";

export default function UserHome() {
    return (
        <div>

            <h2 className="mb-4">Employee Dashboard</h2>

            {/* Summary Cards */}
            <div className="row g-4">

                <div className="col-md-3">
                    <div className="card shadow-sm border-0 text-center">
                        <div className="card-body">
                            <h5>Projects</h5>
                            <h2 className="text-primary">3</h2>
                            <p className="text-muted">
                                Assigned Projects
                            </p>
                        </div>
                    </div>
                </div>

                <div className="col-md-3">
                    <div className="card shadow-sm border-0 text-center">
                        <div className="card-body">
                            <h5>Tasks</h5>
                            <h2 className="text-success">12</h2>
                            <p className="text-muted">
                                Total Tasks
                            </p>
                        </div>
                    </div>
                </div>

                <div className="col-md-3">
                    <div className="card shadow-sm border-0 text-center">
                        <div className="card-body">
                            <h5>Pending</h5>
                            <h2 className="text-warning">5</h2>
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
                            <h2 className="text-danger">7</h2>
                            <p className="text-muted">
                                Completed Tasks
                            </p>
                        </div>
                    </div>
                </div>

            </div>

            {/* Main Content */}
            <div className="row mt-5">

                {/* Assigned Projects */}
                <div className="col-md-8">
                    <div className="card shadow-sm border-0">
                        <div className="card-body">

                            <h4>Assigned Projects</h4>

                            <table className="table table-hover mt-3">
                                <thead>
                                    <tr>
                                        <th>Project Name</th>
                                        <th>Role</th>
                                        <th>Status</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <tr>
                                        <td>Skill Allocation System</td>
                                        <td>Frontend Developer</td>
                                        <td>
                                            <span className="badge bg-success">
                                                Active
                                            </span>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td>Inventory System</td>
                                        <td>Backend Developer</td>
                                        <td>
                                            <span className="badge bg-warning text-dark">
                                                In Progress
                                            </span>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td>CRM Portal</td>
                                        <td>Tester</td>
                                        <td>
                                            <span className="badge bg-primary">
                                                Planning
                                            </span>
                                        </td>
                                    </tr>
                                </tbody>

                            </table>

                        </div>
                    </div>
                </div>

                {/* Quick Actions */}
                <div className="col-md-4">
                    <div className="card shadow-sm border-0">
                        <div className="card-body">

                            <h4>Quick Actions</h4>

                            <div className="d-grid gap-2 mt-3">

                                <button className="btn btn-primary">
                                    View Tasks
                                </button>

                                <button className="btn btn-success">
                                    Update Progress
                                </button>

                                <button className="btn btn-warning">
                                    View Skills
                                </button>

                                <button className="btn btn-info text-white">
                                    View Reports
                                </button>

                            </div>

                        </div>
                    </div>
                </div>

            </div>

            {/* Recent Tasks */}
            <div className="row mt-4">

                <div className="col-md-12">
                    <div className="card shadow-sm border-0">
                        <div className="card-body">

                            <h4>Recent Tasks</h4>

                            <table className="table table-striped mt-3">
                                <thead>
                                    <tr>
                                        <th>Task</th>
                                        <th>Priority</th>
                                        <th>Deadline</th>
                                        <th>Status</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <tr>
                                        <td>Develop Login Module</td>
                                        <td>
                                            <span className="badge bg-danger">
                                                High
                                            </span>
                                        </td>
                                        <td>20 Jun 2026</td>
                                        <td>
                                            <span className="badge bg-warning text-dark">
                                                Pending
                                            </span>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td>Create Dashboard UI</td>
                                        <td>
                                            <span className="badge bg-primary">
                                                Medium
                                            </span>
                                        </td>
                                        <td>22 Jun 2026</td>
                                        <td>
                                            <span className="badge bg-success">
                                                Completed
                                            </span>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td>API Integration</td>
                                        <td>
                                            <span className="badge bg-danger">
                                                High
                                            </span>
                                        </td>
                                        <td>25 Jun 2026</td>
                                        <td>
                                            <span className="badge bg-info">
                                                In Progress
                                            </span>
                                        </td>
                                    </tr>
                                </tbody>

                            </table>

                        </div>
                    </div>
                </div>

            </div>

        </div>
    );
}