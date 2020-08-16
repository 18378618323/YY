<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <title>商品列表</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>商品列表---显示所有商品</small>
                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/index.jsp">返回</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/toAddProduct">新增商品</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/deleteAll">批量删除</a>
            </div>
<%--            <div class="col-md-4 column"></div>--%>
        </div>
        <div class="col-md-4 column">
            <%--搜索功能--%>
            <form class="form-inline" action="${pageContext.request.contextPath}/voQuery" method="post" style="float: right">
                <span style="color: red;font-weight: bold">${error}</span>
                <input type="text" name="product.name" class="form-control" placeholder="请输入要查询的商品名称">
                <input type="text" name="product.price" class="form-control" placeholder="请输入要查询的商品价格">
                <input type="text" name="user.username" class="form-control" placeholder="请输入要查询的用户名">
                <input type="text" name="user.sex" class="form-control" placeholder="请输入要查询的商用户性别">
                <input type="submit" value="搜索" class="btn btn-primary">
            </form>
        </div>

    </div>

    <form action="" class="form-inline" method="post" style="float: right">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th></th>
                        <th>商品编号</th>
                        <th>商品名</th>
                        <th>商品价格</th>
                        <th>商品描述</th>
                        <th>商品照片</th>
                        <th>创建时间</th>
                        <th>操作</th>
                    </tr>
                    </thead>

                    <tbody>
                    <c:forEach var="product" items="${list}">
                        <tr>
                            <th><input type="checkbox" name="ids" value="${product.id}"></th>
                            <td>${product.id}</td>
                            <td>${product.name}</td>
                            <td>${product.price}</td>
                            <td>${product.detail}</td>
                            <td><img src="${pageContext.request.contextPath}/iamges/${product.pic}" style="width: 30%;height: 30%"/></td>
                            <td><fmt:formatDate value="${product.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                            <th>
                                <a href="${pageContext.request.contextPath}/toUpdateProduct/${product.id}">修改</a>
                                &nbsp;  |  &nbsp;
                                <a href="#">删除</a>
                            </th>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </form>


</div>

</body>
</html>
