<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/16
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--在java代码中嵌套html--%>
<%
  for (int i = 0; i < 5; i++) {
%>
  <h1>hello user!<%=i%></h1>
<%
  }
%>
</body>
</html>
