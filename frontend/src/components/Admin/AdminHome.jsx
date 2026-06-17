export default function AdminHome() {
    return (
        <div>
            <h2 className="mb-4">Admin Dashboard</h2>

            <div className="row g-4">

                <div className="col-md-3">
                    <div className="card shadow-sm border-0 text-center">
                        <div className="card-body">
                            <h5>Total Employees</h5>
                            <h2 className="text-primary">120</h2>
                            <p className="text-muted">
                                Registered Employees
                            </p>
                        </div>
                    </div>
                </div>

                <div className="col-md-3">
                    <div className="card shadow-sm border-0 text-center">
                        <div className="card-body">
                            <h5>Managers</h5>
                            <h2 className="text-success">15</h2>
                            <p className="text-muted">
                                Active Managers
                            </p>
                        </div>
                    </div>
                </div>

                <div className="col-md-3">
                    <div className="card shadow-sm border-0 text-center">
                        <div className="card-body">
                            <h5>Projects</h5>
                            <h2 className="text-warning">28</h2>
                            <p className="text-muted">
                                Running Projects
                            </p>
                        </div>
                    </div>
                </div>

                <div className="col-md-3">
                    <div className="card shadow-sm border-0 text-center">
                        <div className="card-body">
                            <h5>Skills</h5>
                            <h2 className="text-danger">54</h2>
                            <p className="text-muted">
                                Available Skills
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
                                        <th>Manager</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <tr>
                                        <td>ETMS Portal</td>
                                        <td>
                                            <span className="badge bg-success">
                                                Active
                                            </span>
                                        </td>
                                        <td>Rahul Sharma</td>
                                    </tr>

                                    <tr>
                                        <td>CRM System</td>
                                        <td>
                                            <span className="badge bg-warning text-dark">
                                                In Progress
                                            </span>
                                        </td>
                                        <td>Priya Patil</td>
                                    </tr>

                                    <tr>
                                        <td>Inventory App</td>
                                        <td>
                                            <span className="badge bg-primary">
                                                Planning
                                            </span>
                                        </td>
                                        <td>Amit Joshi</td>
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
                                    Add Employee
                                </button>

                                <button className="btn btn-success">
                                    Add Manager
                                </button>

                                <button className="btn btn-warning">
                                    Create Project
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