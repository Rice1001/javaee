<%--
  Created by IntelliJ IDEA.
  User: Rice
  Date: 2020/5/3
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生作业管理系统</title>
</head>
<body>
    <div style="align-self: center;padding-top: 20px">
        <form method="post" action="/api/homework/add">
            <fieldset>
                <legend> 添加作业</legend>
                <br>
                homework id: <input type="text" name="id" />
                <br />
                homework title: <input type="text" name="title" />
                <br />
                homework content: <input type="text" name="content" />
                <br />
                <input type="submit" value="Submit" />
                <br>
            </fieldset>
        </form>
    </div>
</body>
</html>
