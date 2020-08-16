<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/10/010
  Time: 下午 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login2</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名:<input type="text" name="username">
    密码:<input type="password" name="password">
    <input type="submit" value="提交">
</form>
</body>
</html>
