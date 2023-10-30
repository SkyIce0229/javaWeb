<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        ArrayList<String> people = new ArrayList<>();
        people.add(0,"lam");
        people.add(1,"lam1");
        people.add(2,"lam2");
        people.add(3,"lam3");
        people.add(4,"lam4");
        people.add(5,"lam5");
        people.add(6,"lam6");
        people.add(7,"lam7");
        request.setAttribute("list",people);
    %>
<c:forEach var="people" items="${list}">
    <c:out value="${people}"/> <br>
</c:forEach>
    <hr>
<%--从1开始循环3结束步进为1--%>
<c:forEach var="people" items="${list}" begin="1" end="3" step="1">
    <c:out value="${people}"/> <br>
</c:forEach>
</body>
</html>
