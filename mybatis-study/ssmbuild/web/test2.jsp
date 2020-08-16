<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax</title>

    <script src="static/js/jquery-1.11.0.js"></script>

    <script>
        $(function () {
            $("#btn").click(function () {
                $.post("${pageContext.request.contextPath}/a2",function (data) {
                    //console.log(data)
                    let bookdata = "";

                    for (let i = 0;i < data.length;i++){
                        bookdata += "<tr>"+
                                "<td>"+data[i].bookID+"</td>"+
                            "<td>"+data[i].bookName+"</td>"+
                            "<td>"+data[i].bookCounts+"</td>"+
                            "<td>"+data[i].detail+"</td>"+
                                "</tr>"
                    }
                    $("#content").html(bookdata);
                })
            })
        })
    </script>

</head>
<body>

    <input type="button" value="加载数据" id="btn">
    <table>
        <tr>
            <td>id</td>
            <td>姓名</td>
            <td>数量</td>
            <td>描述</td>
        </tr>
        <tbody id="content">

        </tbody>
    </table>
</body>
</html>
