<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<header>
<title>Treasure Game</title>
<link type="text/css" rel="stylesheet" href="css/treasure.css"/>
</header>
<body>

<div class="wrapper">
    <h1>Treasures</h1>
    <c:if test="${not empty treasure}">
    You found ${treasure}!
     <div>
          <a href="${flowExecutionUrl}&_eventId=pickUp&country=${country}">Pick Up</a>
     </div>
     </c:if>
     <c:if test="${empty treasure}">
     Sorry, there is no treasure.
     <div>
     <a href="${flowExecutionUrl}&_eventId=continue">Find Again</a>
     </div>
     </c:if>
</div>
</body>
</html>