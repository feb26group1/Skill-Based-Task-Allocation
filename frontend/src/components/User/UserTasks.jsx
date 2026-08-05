export default function UserTasks() {
    return (
        <div>
            <h2 className="mb-4">My Tasks</h2>

            <div className="card shadow-sm border-0">
                <div className="card-body">

                    <h4 className="mb-3">Assigned Tasks</h4>

                    <div className="table-responsive">
                        <table className="table table-hover align-middle">

                            <thead>
                                <tr>
                                    <th>Task ID</th>
                                    <th>Task Name</th>
                                    <th>Project</th>
                                    <th>Priority</th>
                                    <th>Deadline</th>
                                    <th>Status</th>
                                </tr>
                            </thead>

                            <tbody>

                                <tr>
                                    <td>T001</td>
                                    <td>Develop Login Module</td>
                                    <td>STAS</td>
                                    <td>
                                        <span className="badge bg-danger">
                                            High
                                        </span>
                                    </td>
                                    <td>20 Aug 2026</td>
                                    <td>
                                        <span className="badge bg-warning text-dark">
                                            Pending
                                        </span>
                                    </td>
                                </tr>

                                <tr>
                                    <td>T002</td>
                                    <td>Create Dashboard UI</td>
                                    <td>STAS</td>
                                    <td>
                                        <span className="badge bg-primary">
                                            Medium
                                        </span>
                                    </td>
                                    <td>22 Aug 2026</td>
                                    <td>
                                        <span className="badge bg-info">
                                            In Progress
                                        </span>
                                    </td>
                                </tr>

                                <tr>
                                    <td>T003</td>
                                    <td>API Integration</td>
                                    <td>Inventory System</td>
                                    <td>
                                        <span className="badge bg-danger">
                                            High
                                        </span>
                                    </td>
                                    <td>25 Aug 2026</td>
                                    <td>
                                        <span className="badge bg-success">
                                            Completed
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