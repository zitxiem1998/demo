<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 28/03/2019
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Condiments</title>
</head>
<body>
<fieldset>
    <legend>Condiment</legend>
    <h1>Your choice: </h1>
    <h2>
        <c:forEach items="${condiment}" var="result">
            ${result}
        </c:forEach>
    </h2>
</fieldset>
</body>
</html>
