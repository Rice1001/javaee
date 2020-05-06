<%@ page import="org.example.spring.model.Homework" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div style="align-self: center;padding-top: 20px">
        <table align="center" width = "960" border="1" bgcolor="#f0f8ff" cellpadding="1" cellspacing="1">
            <tr align="center" height = "35" bgcolor="#ffe4c4">
                <td>作业编号</td>
                <td>作业标题</td>
                <td>作业内容</td>
                <td>创建时间</td>
            </tr>
            <%
                List<Homework> list = (List<Homework>) request.getAttribute("homeworkList");
                if(list == null){
                    out.println("none data");
                }else{
                    for(Homework hm :list){
            %>
            <tr align="center" >
                <td><%=hm.getId()%></td>
                <td><%=hm.getTitle()%></td>
                <td><%=hm.getContent()%></td>
                <td><%=hm.getCreate_time()%></td>
            </tr>
            <%
                    }
                }
            %>
        </table>
    </div>
</body>
</html>
