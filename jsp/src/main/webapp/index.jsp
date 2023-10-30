<%@ page import="java.util.Date" %>
<html>
<head>
    <title>$title$</title>
</head>
<body>
<%--jsp注释语法
    输出语句：<%= %>
--%>
<%= new Date()%>
<%--jsp脚本片段--%>
<%--    求和--%>
<%
    int sum = 0;
    for (int i = 0; i <= 100; i++) {
        sum += i;
    }
    out.println("<h1>sum="+sum+"</h1>");
%>

<%--jsp片段域--%>
<%
    int x = 0;
    out.println(x);
%>
<%--不能重复定义x--%>
<%
    int y = 1;
    out.println(y);
%>
</body>
</html>
