<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--jsp的内置对象--%>
<%
    pageContext.setAttribute("name1","lam1");
    request.setAttribute("name2","lam2");
    session.setAttribute("name3","lam3");
    application.setAttribute("name4","lam4");
//    保持值的同时指定作用域
    pageContext.setAttribute("hello1","hello1",PageContext.SESSION_SCOPE);
%>
<%--获取值
    顺序 从小到大：page>request>session>application
--%>
<%
    String name1 = pageContext.findAttribute("name1").toString();
    String name2 = pageContext.findAttribute("name2").toString();
    String name3 = pageContext.findAttribute("name3").toString();
    String name4 = pageContext.findAttribute("name4").toString();
    String name5 = (String) pageContext.findAttribute("name5");
%>

<%--输出 EL表达式--%>
<h1>姓名输出的值为：</h1>
<h3>${{name1}}</h3>
<h3>${{name2}}</h3>
<h3>${{name3}}</h3>
<h3>${{name4}}</h3>
<h3>${{name5}}</h3>
<h3><%=name5%></h3>
</body>
</html>
