import Home from "./pages/Home";
import LoginComp from "./components/LoginComp";
import UserDashboard from "./pages/UserDashboard";
import AdminDashboard from "./pages/AdminDashboard";
import ManagerDashboard from "./pages/Manager";
import LogOutComp from "./pages/LogOutComp";
import ProtectedRoutes from "./components/ProtectedRoutes";
import AdminHome from "./components/Admin/AdminHome";

import { BrowserRouter, Routes, Route } from "react-router-dom";

function App() {
  return (
    <BrowserRouter>
      <Routes>

        {/* Public Routes */}
        <Route path="/" element={<Home />}>
          {/* <Route path="login" element={<LoginComp />} /> */}
          <Route path="login" element={<ManagerDashboard />} />
          <Route path="register" element={<h2>Register Form</h2>} />
        </Route>

        {/* Admin Routes */}
        <Route
          path="/admin"
          element={
            <ProtectedRoutes role={1}>
              <AdminDashboard />
            </ProtectedRoutes>
          }
        >
          {/* Default Page */}
          <Route index element={<AdminHome />} />

          {/* Future Admin Pages */}
          {/* <Route path="employees" element={<EmployeeComp />} /> */}
          {/* <Route path="projects" element={<ProjectComp />} /> */}
          {/* <Route path="reports" element={<ReportsComp />} /> */}

          <Route path="logout" element={<LogOutComp />} />
        </Route>

        {/* User Routes */}
        <Route
          path="/user"
          element={
            <ProtectedRoutes role={2}>
              <UserDashboard />
            </ProtectedRoutes>
          }
        />

        {/* Manager Routes */}
        <Route
          path="/manager"
          element={
            <ProtectedRoutes role={3}>
              <ManagerDashboard />
            </ProtectedRoutes>
          }
        />

        {/* Logout */}
        <Route path="/logout" element={<LogOutComp />} />

        {/* Unauthorized */}
        <Route
          path="/unauthorized"
          element={
            <div className="container mt-5">
              <h2>Unauthorized Access</h2>
              <p>You don't have permission to access this page.</p>
            </div>
          }
        />

      </Routes>
    </BrowserRouter>
  );
}

export default App;