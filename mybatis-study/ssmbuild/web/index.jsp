<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/9/009
  Time: 上午 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>

    <style>
      a{
        text-decoration: none;
        color: black;
        font-size: 18px;
      }
      h3{
        width: 180px;
        height: 38px;
        margin: 100px auto;
        text-align: center;
        line-height: 38px;
        background-color: deepskyblue;
        border-radius: 5px;
      }
    </style>

  </head>
  <body>
  <h3>
<a href="${pageContext.request.contextPath}/book/allBook">进书籍展示页面</a>
  </h3>
  <h3>
    <a href="${pageContext.request.contextPath}/user/toLogin">登陆</a>
  </h3>
  <h3>
    <a href="${pageContext.request.contextPath}/user/main">首页2</a>
  </h3>
  <h3>
    <a href="fileUpload.jsp">文件上传</a>
  </h3>
  </body>
</html>
