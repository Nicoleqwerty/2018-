<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ForUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	充当Servlet的作用
	-->

  </head>
  
  <body>
   <%
   
   //获取表单输入的用户名和 密码
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		if(uname.equals("admin")&&pwd.equals("123456")){
			//转向成功页面  转发 和 重定向
			//转发：
			request.getRequestDispatcher("success.jsp").forward(request, response);
			
		}else{
			//重定向：
			response.sendRedirect("error.jsp");
			
		}
   
    %>
  </body>
</html>
