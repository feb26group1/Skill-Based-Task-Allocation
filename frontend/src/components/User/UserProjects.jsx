export default function UserProjects() {
    return (
        <div>
            <h2 className="mb-4">My Projects</h2>

            <div className="card shadow-sm border-0">
                <div className="card-body">

                    <h4 className="mb-3">Assigned Projects</h4>

                    <div className="table-responsive">
                        <table className="table table-hover align-middle">

                            <thead>
                                <tr>
                                    <th>Project ID</th>
                                    <th>Project Name</th>
                                    <th>My Role</th>
                                    <th>Start Date</th>
                                    <th>End Date</th>
                                    <th>Status</th>
                                </tr>
                            </thead>

                            <tbody>

                                <tr>
                                    <td>P001</td>
                                    <td>Skill Based Task Allocation</td>
                                    <td>Backend Developer</td>
                                    <td>01 Aug 2026</td>
                                    <td>30 Sep 2026</td>
                                    <td>
                                        <span className="badge bg-success">
                                            Active
                                        </span>
                                    </td>
                                </tr>

                                <tr>
                                    <td>P002</td>
                                    <td>Inventory System</td>
                                    <td>Backend Developer</td>
                                    <td>15 Jul 2026</td>
                                    <td>15 Sep 2026</td>
                                    <td>
                                        <span className="badge bg-warning text-dark">
                                            In Progress
                                        </span>
                                    </td>
                                </tr>

                                <tr>
                                    <td>P003</td>
                                    <td>CRM Portal</td>
                                    <td>Tester</td>
                                    <td>01 Sep 2026</td>
                                    <td>30 Oct 2026</td>
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
        </div>
    );
}