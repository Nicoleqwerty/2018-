<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'CookieTest.jsp' starting page</title>
    
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
    <!-- 访问页面时  如果有Cookie信息 则打印内容 如果没有 则添加Cookie  uname：zhangsan-->
    <%
   Cookie[] cs= request.getCookies();//从请求中获取所有的Cookie信息
   if(cs==null||cs.length==0){//没有 就创建   
   	Cookie c=new Cookie("uname","zhangsan");//创建对象
   	c.setMaxAge(30);//以秒为单位
   	response.addCookie(c);//通过响应对象 传送到浏览器端   
   	%>
   	现在没有Cookie   	
   	<%
   }else{//有cookie信息
   	for(Cookie c : cs){
   		out.print(c.getName()+"---"+c.getValue()+"<br>");//如果存在则打印对应信息
   	} 	
   
   }
    
    
     %>
    
    
    
    
    
    
    
    
  </body>
</html>
