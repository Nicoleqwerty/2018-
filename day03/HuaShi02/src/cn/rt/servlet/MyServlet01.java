package cn.rt.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * ��һ��Servlet��
 * @author azhu
 *
 */
public class MyServlet01 implements Servlet {
	public MyServlet01(){
		System.out.println("�޲ι��췽����");			
	}
	private ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;//�����Ը�ֵ
		System.out.println("��ʼ��������Ϣ������������");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			System.out.println("����ҵ�񡣡�������ʼ");
			ServletContext context=config.getServletContext();//�����Ķ���  ͨ��config���
			String db=context.getInitParameter("db");//���webӦ�õĳ�ʼ������
			System.out.println(db);
			System.out.println(context.getRealPath("/index.jsp"));
			
			
			
			
			//config
		/*	System.out.println("getServletName:"+config.getServletName());
			//��ó�ʼ������ 
			String uname=config.getInitParameter("uname");
			System.out.println("getInitParameter:"+uname);			
			System.out.println("getServletConext��"+config.getServletContext());	*/	
			
			System.out.println("����ҵ�񡣡���������");
			
			
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
		System.out.println("���ٶ��󡣡�������");
		
	}

}
