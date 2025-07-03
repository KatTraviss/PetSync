<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Pet Profile</title>
  <link rel="stylesheet" href="CSS/style4.css">
</head>
<body>
  <div class="pet-header">
    <div class="pet-photo-header">
      <img src="images/Rui1.jpg" alt="Pet Photo">
    </div>
    <div class="pet-header-text">
      <h1 class="pet-name">Name: Rui</h1>
      <p class="shelter-id">Shelter ID: PS-00123</p>
    </div>
    <div class="header-buttons">
      <button onclick="location.href='Dashboard.jsp'">Dashboard</button>
      <button onclick="location.href='logout.jsp'">Log Out</button>
    </div>
  </div>

  <div class="pet-container">
    <!-- Center Column -->
    <div class="center-column">
      <div class="info-box">
        <h2>Description</h2>
        <p>Breed: Chihuahua Cross</p>
        <p>Color: Light Brown</p>
        <p>Weight: 2kg</p>
        <p>Intake Date: 2025-06-15</p>
        <p>Special Notes: Tiny Terror.</p>
      </div>

      <div class="info-box">
        <h2>Adoption Status</h2>
        <p>Adopted: No</p>
        <p>Adoptable: Yes</p>
        <p>Notes: Cleared for adoption.</p>
      </div>
    </div>

    <!-- Right Column -->
    <div class="right-column">
      <div class="info-box">
        <h2>Medical Info</h2>
        <p>Vaccinations: Rabies, DHPP, Bordetella</p>
        <p>Treatments: Dewormed</p>
        <p>Special Needs: Consent Attention</p>
      </div>

      <div class="info-box">
        <h2>Care Instructions</h2>
        <p>Feeding Schedule: Twice daily (8am, 6pm)</p>
        <p>Medications: None</p>
        <p>Exercise: 30 mins morning walk</p>
        <p>Enrichment: Chew toys, fetch</p>
        <p>Cleaning: Kennel cleaned daily</p>
      </div>
    </div>
  </div>
</body>
</html>
