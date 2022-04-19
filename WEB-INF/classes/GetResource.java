import java.io.*;
import java.util.Properties;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetResource extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter out = res.getWriter();
		ServletContext context = this.getServletContext();
		InputStream in = context.getResourceAsStream("WEB-INF/classes/itcast.properties");
		Properties pros = new Properties();
		pros.load(in);
		out.println("Company="+pros.getProperty("Company")+"\n");
		out.println("Address="+pros.getProperty("Address")+"\n");
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		this.doGet(req,res);
	}
}