import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestMethodServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter out=res.getWriter();
		//out.write("this is doGet method");
		
		ServletConfig config = this.getServletConfig();
		out.println("encoding="+config.getInitParameter("encoding")+"</br>");
		
		res.setContentType("text/html;charset=utf-8");
		ServletContext context = this.getServletContext();
		context.setAttribute("data","this servlet save data");
		out.println(context.getAttribute("data")+"</br>");
		Enumeration<String> paramNames=context.getInitParameterNames();
		out.println("all the paramName and paramValue are following:</br>");
		while(paramNames.hasMoreElements()){
			String name = paramNames.nextElement();
			String value = context.getInitParameter(name);
			out.println(name+":"+value);
			out.println("<br/>");
		}
		
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter out=res.getWriter();
		//out.write("this is doPost methos");
		this.doGet(req,res);
	}
}