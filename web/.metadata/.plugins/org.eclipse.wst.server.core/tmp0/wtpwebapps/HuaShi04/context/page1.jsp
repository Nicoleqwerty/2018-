<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   设置参数 存储到各个作用域
   <%
   pageContext.setAttribute("page", "pageValue");//向page环境中设置参数  名字：page  值：pageValue
   request.setAttribute("req", "requestValue");
   session.setAttribute("ses", "sessionValue");
   application.setAttribute("app","appValue");
   %>
   page: <%=pageContext.getAttribute("page") %><br><!-- 都有 -->
   request: <%=request.getAttribute("req") %><br>
   session: <%=session.getAttribute("ses") %><br>
   application: <%=application.getAttribute("app") %><br>
   
   <%
   //重定向 response.sendRedirect("page2.jsp");
   //转发
   request.getRequestDispatcher("page2.jsp").forward(request, response);
   %>
   
  </body>
</html>
