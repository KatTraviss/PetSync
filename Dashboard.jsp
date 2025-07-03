<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Dashboard</title>
  <link rel="stylesheet" href="CSS/styles3.css" />
</head>
<body>
  <!-- Top bar -->
  <header class="top-bar">
    <img src="images/PetSyncLogo.png" alt="PetSync Logo" class="logo" />
    <button onclick="window.location.href='logout'" class="logout-btn">Logout</button>
  </header>

  <div class="dashboard-container">
    <!-- Sidebar -->
    <nav class="sidebar">
      <ul>
        <li><a href="#" class="active">Pets in Care</a></li>
        <li><a href="#">Adoptions</a></li>
        <li><a href="#">Donations</a></li>
        <li><a href="#">Reports</a></li>
        <li><a href="pet.jsp">Assigned Pets</a></li>
        <li><a href="#">Assigned Tasks</a></li>
      </ul>
    </nav>

    <!-- Main content -->
    <main class="main-content">
      <h1>Welcome to Your Dashboard</h1>
      <p>Select an option from the sidebar to get started.</p>
    </main>
  </div>
</body>
</html>
