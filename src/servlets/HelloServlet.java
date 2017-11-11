package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
//  构造方法-> init( )  
	// service() serlet创建之后缓存起来，不会立即销毁,doGet doPost在service()之后进行
	// destroy() 服务器关闭，就会销毁
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//response.getWriter().append("Served at: ").append(request.getContextPath());
				response.setContentType("text/html;charset=UTF-8");
				String requestName="1";
				if(request.getParameter("name")!=null){
					requestName =new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");
				}
				if(requestName==null){
					requestName="1";
				}
				PrintWriter writer=response.getWriter();
				writer.println("<!DOCTYPE html> \n");
				writer.println(
					    "<html>\n" +
					    "<head><title>" + "标题" + "</title></head>\n" +
					    "<body bgcolor=\"#f0f0f0\">\n" +
					    "<h1 align=\"center\">" + "标题" + "</h1>\n" +
					    "<ul>\n" +
					    "  <li><b>站点名</b>："
					    + requestName+"新名字" + "\n" +
					    "  <li><b>网址</b>："
					    + request.getParameter("url") + "\n" +
					    "</ul>\n" +
					    "</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}
}
