
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% %>
<html>
<head>
    <title>用户</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>用户列表---显示所有用户</small>
                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="#">新增用户</a>
            </div>
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/index.jsp">返回</a>
            </div>
            <div class="col-md-4 column"></div>>
            <div class="col-md-4 column"></div>>
            <div class="col-md-4 column">
                <%--搜索功能--%>
                <form class="form-inline" action="#" method="post" style="float: right">
                    <span style="color: red;font-weight: bold">${error}</span>
                    <input type="text" name="queryBookName" class="form-control" placeholder="请输入要查询的用户名称">
                    <input type="submit" value="搜索" class="btn btn-primary">
                </form>
            </div>
        </div>

    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>用户编号</th>
                    <th>用户名</th>
                    <th>用户生日</th>
                    <th>用户性别</th>
                    <th>用户地址</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="user" items="${list}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.username}</td>
                        <td>${user.birthday}</td>
                        <td>${user.sex}</td>
                        <td>${user.address}</td>
                        <th>
                            <a href="#">修改</a>
                            &nbsp;  |  &nbsp;
                            <a href="#">删除</a>
                        </th>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>

</body>
</html>
