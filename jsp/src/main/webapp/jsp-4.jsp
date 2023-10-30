<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/10/16
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--jsp标签--%>
<%--实际是三个页面拼接(header+body+footer).作用域是独立的--%>

<%--插入头部页面--%>
<jsp:include page="common/header.jsp"/>

<h1>网页主站</h1>
<%--插入尾部页面--%>
<jsp:include page="common/footer.jsp"/>

</body>
</html>
