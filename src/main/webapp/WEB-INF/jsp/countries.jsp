<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<header>
<title>Treasure Game</title>
<link type="text/css" rel="stylesheet" href="css/treasure.css"/>
</header>
<body>

<div class="wrapper">
    <h1>Country</h1>
    <ul>
    <c:forEach var="country" items="${countries}">
    <li><a href="${flowExecutionUrl}&_eventId=findTreasure&country=${country}">${country}</a></li>
    </c:forEach>
    </ul>
</div>
</body>
</html>