<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page import="Model.cart" %>
<%@ page import="java.util.List" %>
<%@ page import="Model.Livre" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    cart cc= cart.getcart();

    request.setAttribute("Livres",cc.getLivre());
%>
<html>
<head>
    <title>catalogue</title>
    <link rel="stylesheet" href="Style/cart.css" />
</head>
<body>
<form action="./panel" method="post">
<h2>Accordion</h2>
<c:forEach items="${requestScope.Livres}" var="livre">
<button type="button" class="accordion">${livre.nom}</button>

<div class="panel">

    <label>${livre.prix}
        <input type="checkbox" checked="checked" name=livre value="${livre.id}"> ajouter
    </label>
</div>
</c:forEach>
<input type="submit" value=ajouter class="btn btn-primary" />
</form>

    <script src="script/script.js"></script>
</body>

</html>
