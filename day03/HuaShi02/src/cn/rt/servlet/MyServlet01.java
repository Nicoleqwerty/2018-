package cn.rt.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 第一个Servlet类
 * @author azhu
 *
 */
public class MyServlet01 implements Servlet {
	public MyServlet01(){
		System.out.println("无参构造方法！");			
	}
	private ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;//将属性赋值
		System.out.println("初始化配置信息。。。。。。");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			System.out.println("处理业务。。。。开始");
			ServletContext context=config.getServletContext();//上下文对象  通过config获得
			String db=context.getInitParameter("db");//获得web应用的初始化参数
			System.out.println(db);
			System.out.println(context.getRealPath("/index.jsp"));
			
			
			
			
			//config
		/*	System.out.println("getServletName:"+config.getServletName());
			//获得初始化参数 
			String uname=config.getInitParameter("uname");
			System.out.println("getInitParameter:"+uname);			
			System.out.println("getServletConext："+config.getServletContext());	*/	
			
			System.out.println("处理业务。。。。结束");
			
			
	}
	

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	

	
	@Override
	public void destroy() {
		System.out.println("销毁对象。。。。。");
		
	}

}
