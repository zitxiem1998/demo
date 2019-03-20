<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 20/03/2019
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
</head>
<body>
<%
    float rate=Float.parseFloat(request.getParameter("rate"));
    float usd=Float.parseFloat(request.getParameter("usd"));
    float vnd=rate*usd;
%>
<h1><%=rate %></h1>
<h2><%=usd%></h2>
<h3><%=vnd%></h3>
</body>
</html>
