<%--
  Created by IntelliJ IDEA.
  User: Rice
  Date: 2020/5/3
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生作业管理系统</title>
</head>
<body>
    <div style="align-self: center; padding-top: 20px">
        <form method="post" action="/api/student/add">
            <fieldset>
                <legend> 添加学生</legend>
                <br>
                student id: <input type="text" name="studentId">
                <br />
                student name: <input type="text" name="name" />
                <br>
                <input type="submit" value="Submit" />
            </fieldset>
        </form>
    </div>
</body>
</html>
