import java.io.*;
import java.util.Properties;
import javax.servlet.*;
import javax.servlet.http.*;
//@WebServlet("/responseDemo01")
public class ResponseDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //访问/responseDemo01，会自动跳转到/responseDemo02资源
        System.out.println("demo01...");
		PrintWriter out = resp.getWriter();
		out.println("Hello,world!");
        
		//1.设置状态码为302
        resp.setStatus(302);
		
		//2.自动跳转
		//resp.setContentType("text/html;charset=utf-8");
		//resp.setHeader("Refresh","2;url=http://www.baidu.com");
        
		//2.设置响应体location，重定向
		//方法一
        //resp.setHeader("location", "/travelcamel/HelloServlet");
		//方法二
		//resp.sendRedirect("/travelcamel/index.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}