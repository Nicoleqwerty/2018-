package cn.ccnu.servlet;

import java.io.IOException;

import javax.servlet.*;

public class MyServlet implements Servlet{

	private ServletConfig config;
	
	public MyServlet() {
		System.out.println("无参构造函数");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy...");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		//ServletConfig getInitParameter
		System.out.println("init...");
		this.config=config;
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service...");
		//ServletContext context = config.getServletContext();
		//String db =context.getInitParameter("db");
		//System.out.println(db);
	}

}
