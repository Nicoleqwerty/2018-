<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
设置参数存储到各个作用域
<%
pageContext.setAttribute("page", "pageValue");
request.setAttribute("req", "requestValue");
session.setAttribute("sess", "sessionValue");
application.setAttribute("app", "applicationValue");
%>
<%=pageContext.getAttribute("page") %>
<%=request.getAttribute("req") %>
<%=session.getAttribute("sess") %>
<%=application.getAttribute("app") %>
<% request.getRequestDispatcher("page2.jsp").forward(request,response); %>
</body>
</html>