<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="Model.utilisateur" %>
<%@ page import="Model.Livre" %><%--
  Created by IntelliJ IDEA.
  User: ElMehdi
  Date: 13/03/2022
  Time: 02:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
            utilisateur uti = (utilisateur) request.getSession(false).getAttribute("user");

                request.setAttribute("Livres",uti.getLivres());


%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="Style/stu.css" />
</head>
<body>

<h2>Vertical Tabs</h2>
<p>Click on the buttons inside the tabbed menu:</p>
<c:forEach items="${requestScope.Livres}" var="livre">
<div class="tab">
    <button class="tablinks" onclick="openCity(event, 'London')" id="defaultOpen">${livre.nom}</button>

</div>

<div id="London" class="tabcontent">
    <h3>London</h3>
    <p>London is the capital city of England.</p>
</div>
</c:forEach>
<script src="script/scrip.js"></script>

</body>
</html>
