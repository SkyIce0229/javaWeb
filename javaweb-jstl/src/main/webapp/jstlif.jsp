<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--jstlif--%>
<form action="jstlif.jsp" method="get">
    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="登录">
</form>

<c:if test="${param.username == 'admin'}" var="isAdmin">
    <c:out value="管理员欢迎你"/>
</c:if>

<c:out value="${isAdmin}"/>
</body>
</html>
