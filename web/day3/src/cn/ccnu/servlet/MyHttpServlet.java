package cn.ccnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyHttpServlet
 */
@WebServlet("/MyHttpServlet")
public class MyHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyHttpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() throws ServletException{
    }
    
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String path = request.getContextPath();
		StringBuffer url = request.getRequestURL();
		System.out.println("path:"+path);
		System.out.println("url:"+url);
		//转发
		request.getRequestDispatcher("/show.html").forward(request, response);;
		//重定向
		//response.sendRedirect(path+"/show.html");
		//转发和重定向都可以将现在的业务转到另外的目录
		//重定向的最终目录是：show.html
		//转发的最终目录是：MyHttpServlet
		//区别：转发执行了一次请求，重定向执行两次请求
		//转发是服务器内部处理
		//重定向浏览器又发送了一次请求
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}