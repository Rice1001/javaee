<%@ page import="org.example.spring.model.StudentHomework" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Rice
  Date: 2020/5/3
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生作业管理系统</title>
</head>
<body>
    <div style="align-self: center; padding-top: 20px">
        <table align="center" width = "960" border="1" bgcolor="#f0f8ff" cellpadding="1" cellspacing="1">
            <tr align="center" height = "35" bgcolor="#ffe4c4">
                <td>ID</td>
                <td>学号</td>
                <td>作业编号</td>
                <td>作业标题</td>
                <td>作业内容</td>
                <td>创建时间</td>
            </tr>
            <%
                List<StudentHomework> list = (List<StudentHomework>) request.getAttribute("studentHomeworkList");
                if(list == null){
                    out.println("none data");
                }else{
                    for(StudentHomework sh :list){
            %>
            <tr align="center" >
                <td><%=sh.getId()%></td>
                <td><%=sh.getStudentId()%></td>
                <td><%=sh.getHomeworkId()%></td>
                <td><%=sh.getHomeworkTitle()%></td>
                <td><%=sh.getHomeworkContent()%></td>
                <td><%=sh.getCreateTime()%></td>
            </tr>
            <%
                    }
                }
            %>
        </table>
    </div>
</body>
</html>
