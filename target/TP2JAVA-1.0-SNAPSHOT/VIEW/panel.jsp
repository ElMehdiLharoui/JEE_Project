<%--
  Created by IntelliJ IDEA.
  User: ElMehdi
  Date: 13/03/2022
  Time: 02:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="Style/stu.css" />
</head>
<body>

<h2>Vertical Tabs</h2>
<p>Click on the buttons inside the tabbed menu:</p>

<div class="tab">
    <button class="tablinks" onclick="openCity(event, 'London')" id="defaultOpen">London</button>

</div>

<div id="London" class="tabcontent">
    <h3>London</h3>
    <p>London is the capital city of England.</p>
</div>

<script src="script/scrip.js"></script>

</body>
</html>
