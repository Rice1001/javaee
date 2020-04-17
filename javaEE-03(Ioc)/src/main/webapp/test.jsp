<%@ page import="java.util.List" %>
<%@ page import="org.example.spring.model.Student" %><%--
  Created by IntelliJ IDEA.
  User: Rice
  Date: 2020/4/17
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>display</title>
</head>
<body>
hello，test
<%List<Student> students = (List<Student>) request.getAttribute("studentList");
for(Student s: students){
    out.println(s.getName());
}
%>
</body>
</html>
