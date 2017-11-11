package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubmitServlet
 */
@WebServlet("/SubmitServlet")
public class SubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SubmitServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
//  构造方法-> init( )
	// service() serlet创建之后缓存起来，不会立即销毁,doGet doPost在service()之后进行
	// destroy() 服务器关闭，就会销毁
	public void init(){
		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.print("........shibai");
		response.setContentType("text/html;charset=UTF-8");
		String requestName="1";
		String requestPassword="1";
		if(request.getParameter("name")!=null){
			requestName =new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");
		}
		if(request.getParameter("password")!=null){
			requestPassword =new String(request.getParameter("password").getBytes("ISO8859-1"),"UTF-8");
		}
		response.getWriter().append(requestName+"&"+requestPassword);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
