<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<!--  -->
<%
Cookie[] cs = request.getCookies();
if(cs==null||cs.length==0){
	//没有，则创建
	Cookie c = new Cookie("uname","zhangsan");
	response.addCookie(c);//通过响应对象传送到浏览器端
	%>
	现在没有cookie
	<%
}
else{
	for(Cookie c:cs){
		out.print(c.getName()+"---"+c.getValue()+"\n");
	}
}
%>
</body>
</html>