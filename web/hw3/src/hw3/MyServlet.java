package hw3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter out = response.getWriter();
				//response.sendRedirect(path+"/show.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
		
		String uname=request.getParameter("uname");
		String mm=request.getParameter("mm");
		String path = request.getContextPath();
		StringBuffer url = request.getRequestURL();
		System.out.println("path:"+path);
		System.out.println("url:"+url);
		System.out.println("uname:"+uname);
		System.out.println("mm:"+mm);
		if(uname.equals("admin")&&mm.equals("123456")) {
			response.sendRedirect(path+"/login_success.html");
		}
		else {
			response.sendRedirect(path+"/login_error.html");
		}

	}

}
