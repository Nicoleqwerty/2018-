package cn.rt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet02 extends HttpServlet {

	/**
		 * Destruction of the servlet. <br>
		 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//设置编码类型
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");//设置响应类型 html  以及编码
		
		PrintWriter out = response.getWriter();
		//HttpServletRequest 对象 请求对象
		String path=request.getContextPath();
		String uri=request.getRequestURI();
		System.out.println("path:"+path+"----uri:"+uri);
		//将 请求信息转发到另外一个页面
		request.getRequestDispatcher("/index.jsp").forward(request, response);//最终目录：myServlet
		//重定向：重新向另外一个页面发送请求  /代表站点的目录
		//response.sendRedirect(path+"/index.jsp");//最终目录 ：index。jsp
	}

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//设置编码类型
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");//设置响应类型 html  以及编码
		String uname=request.getParameter("uname");//获取请求中的参数  表单的name属性
		System.out.println(uname);
		request.getRequestDispatcher("test.jsp").forward(request, response);
		
		
		
	
	}

	/**
		 * Initialization of the servlet. <br>
		 *
		 * @throws ServletException if an error occurs
		 */
	public void init() throws ServletException {
		// Put your code here
	}

}
