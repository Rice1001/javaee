<%--
  Created by IntelliJ IDEA.
  User: Rice
  Date: 2020/5/3
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生作业管理系统</title>
</head>
<body>
    <div style="align-self: center; padding-top: 20px">
        <form method="post" action="/api/studentHomework/submit">
            <fieldset>
                <legend>提交作业</legend>
                <br>
                student id: <input type="text" name="student_id">
                <br />
                homework id: <input type="text" name="homework_id" />
                <br />
                homework title: <input type="text" name="homework_title" />
                <br />
                homework content: <input type="text" name="homework_content" />
                <br />
                <input type="submit" value="Submit" />
            </fieldset>
        </form>
    </div>
</body>
</html>
