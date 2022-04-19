import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloServlet extends GenericServlet{
	public void service(ServletRequest request,ServletResponse response)throws ServletException,IOException{
		PrintWriter out = response.getWriter();
		out.println("Hello,Servlet");
		ServletContext context = this.getServletContext();
		out.println("data="+context.getAttribute("data"));
	}
}