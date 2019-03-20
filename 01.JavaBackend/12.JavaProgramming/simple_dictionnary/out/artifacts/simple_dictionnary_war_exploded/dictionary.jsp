<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 20/03/2019
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<%!
    Map<String, String> dic = new HashMap<>();
%>
<%
    dic.put("hello", "xin chao");
    dic.put("run", "chay");
    dic.put("go", "tien len");
    dic.put("book", "vo");
    dic.put("table", "ban");

    String seach = request.getParameter("seach");

    String result = dic.get(seach);

    if (result != null) {
        out.println("word " + seach + "</br>");
        out.println("Result:" + result);
    } else {
        out.print("Not Found");
    }

%>

</body>
</html>
