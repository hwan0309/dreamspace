package next0306;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(
//		description = "기본파라미터 지정", 
//		urlPatterns = { 
//				"/Servlet", 
//				"/scg"
//		}, 
//		initParams = { 
//				@WebInitParam(name = "username", value = "홍길동", description = "users name"), 
//				@WebInitParam(name = "user office", value = "ez", description = "users office")
//		})
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 Servlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		String name = getInitParameter("username");
		String office = getInitParameter("useroffice");

		out.print(name + " : " + office);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
