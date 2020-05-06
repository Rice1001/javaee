<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生作业管理系统</title>
    <link rel="stylesheet" type="text/css" href="CSS/performance.css" />
</head>
<body>
<div id = "dh">
    <ul>
        <li><a href = "#">首页</a></li>
        <li><a href = "#">学生</a>
            <ul>
                <li><a href = "/api/homework/display" target="container">查看作业</a><br></li>
                <li><a href = "/api/submitHomework" target="container">提交作业</a><br></li>
            </ul>
        </li>
        <li><a href = "#">教师</a>
            <ul>
                <li><a href = "/api/addHomework" target="container">添加作业</a><br></li>
                <li><a href = "/api/addStudent" target="container">添加学生</a><br></li>
                <li><a href = "/api/studentHomework/display" target="container">查看学生作业</a><br></li>
            </ul>
        </li>
    </ul>
</div>
<div id="container">
    <iframe name = "container" style="height: 100%; width: 100%"></iframe>
</div>
</body>
</html>
