<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Pet Details</title>
  <link rel="stylesheet" href="CSS/style4.css" />
</head>
<body>
  <div class="pet-container">

    <!-- Left Column: Photo & Description -->
    <div class="left-column">
      <div class="pet-photo">
        <img src="${pet.photoUrl}" alt="Photo of ${pet.name}" />
      </div>
      <div class="pet-description">
        <p><strong>Color:</strong> ${pet.description.color}</p>
        <p><strong>Age:</strong> ${pet.age} years</p>
        <p><strong>Weight:</strong> ${pet.description.weightKg} kg</p>
        <p><strong>Intake Date:</strong> ${pet.description.intakeDate}</p>
        <p><strong>Notes:</strong> ${pet.description.specialNotes}</p>
      </div>
    </div>

    <!-- Center Column: Name & Shelter ID -->
    <div class="center-column">
      <h1 class="pet-name">${pet.name}</h1>
      <p class="shelter-id"><strong>Shelter ID:</strong> ${pet.shelterId}</p>
      <p><strong>Adoption Status:</strong> 
        <c:choose>
          <c:when test="${pet.adoptionStatus.adopted}">Adopted</c:when>
          <c:when test="${pet.adoptionStatus.adoptable}">Available for Adoption</c:when>
          <c:otherwise>Not Adoptable</c:otherwise>
        </c:choose>
      </p>
      <p><strong>Adoption Notes:</strong> ${pet.adoptionStatus.adoptionNotes}</p>
    </div>

    <!-- Right Column: Medical Info & Care Instructions -->
    <div class="right-column">
      <div class="medical-info">
        <h2>Medical Info</h2>
        <p><strong>Vaccinations:</strong> 
          <c:forEach var="vac" items="${pet.medical.vaccinations}" varStatus="status">
            ${vac}<c:if test="${!status.last}">, </c:if>
          </c:forEach>
        </p>
        <p><strong>Treatments:</strong> 
          <c:forEach var="treatment" items="${pet.medical.treatments}" varStatus="status">
            ${treatment}<c:if test="${!status.last}">, </c:if>
          </c:forEach>
        </p>
        <p><strong>Special Needs:</strong> ${pet.medical.specialNeeds}</p>
      </div>

      <div class="care-instructions">
        <h2>Care Instructions</h2>
        <p><strong>Feeding Schedule:</strong> 
          <c:forEach var="feed" items="${pet.care.feedingSchedule}" varStatus="status">
            ${feed}<c:if test="${!status.last}">, </c:if>
          </c:forEach>
        </p>
        <p><strong>Exercise Schedule:</strong> 
          <c:forEach var="exercise" items="${pet.care.exerciseSchedule}" varStatus="status">
            ${exercise}<c:if test="${!status.last}">, </c:if>
          </c:forEach>
        </p>
        <p><strong>Enrichment Activities:</strong> 
          <c:forEach var="activity" items="${pet.care.enrichmentActivities}" varStatus="status">
            ${activity}<c:if test="${!status.last}">, </c:if>
          </c:forEach>
        </p>
        <p><strong>Kennel Cleaning / Checks:</strong> Weekly</p>
      </div>
    </div>

  </div>
</body>
</html>
