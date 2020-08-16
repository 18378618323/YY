<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改商品</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/updateProduct" method="post" enctype="multipart/form-data">
        <!--隐藏域-->
        <input type="hidden" name="id" value="${product.id}">

        <%--        <div class="form-group">--%>
        <%--            <label>书籍ID:</label>--%>
        <%--            <input type="text" value="${xBook.bookID}" class="form-control" name="bookID" required>--%>
        <%--        </div>--%>
        <div class="form-group">
            <label>商品名称:</label>
            <input type="text" value="${product.name}" class="form-control" name="name" required>
        </div>
        <div class="form-group">
            <label>商品价格:</label>
            <input type="text" value="${product.price}" class="form-control" name="price" required>
        </div>
        <div class="form-group">
            <label>商品描述:</label>
            <input type="text" value="${product.detail}" class="form-control" name="detail" required>
        </div>
        <div class="form-group">
            <label>商品照片:</label>
            <input type="file" class="form-control" name="pictrueFile"/>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>


</div>

</body>
</html>
