<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <%--美化界面--%>
    <!-- Bootstrap -->

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表---显示所有书籍</small>
                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBookPage">新增书籍</a>
            </div>
            <div class="col-md-4 column"></div>>
            <div class="col-md-4 column">
                <%--搜索功能--%>
                <form class="form-inline" action="${pageContext.request.contextPath}/book/queryBookName" method="post" style="float: right">
                    <span style="color: red;font-weight: bold">${error}</span>
                    <input type="text" name="queryBookName" class="form-control" placeholder="请输入要查询得到书籍名称">
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
                        <th>书籍编号</th>
                        <th>书籍名称</th>
                        <th>书籍数量</th>
                        <th>书籍描述</th>
                        <th>操作</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach var="book" items="${list}">
                        <tr>
                            <td>${book.bookID}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <th>
                                <a href="${pageContext.request.contextPath}/book/toUpdate/${book.bookID}">修改</a>
                                &nbsp;  |  &nbsp;
                                <a href="${pageContext.request.contextPath}/book/deleteBookById/${book.bookID}">删除</a>
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
