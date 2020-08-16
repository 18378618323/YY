<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/9/009
  Time: 下午 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <!--隐藏域-->
        <input type="hidden" name="bookID" value="${xBook.bookID}">

<%--        <div class="form-group">--%>
<%--            <label>书籍ID:</label>--%>
<%--            <input type="text" value="${xBook.bookID}" class="form-control" name="bookID" required>--%>
<%--        </div>--%>
        <div class="form-group">
            <label>书籍名称:</label>
            <input type="text" value="${xBook.bookName}" class="form-control" name="bookName" required>
        </div>
        <div class="form-group">
            <label>书籍数量:</label>
            <input type="text" value="${xBook.bookCounts}" class="form-control" name="bookCounts" required>
        </div>
        <div class="form-group">
            <label>书籍描述:</label>
            <input type="text" value="${xBook.detail}" class="form-control" name="detail" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>


</div>

</body>
</html>
