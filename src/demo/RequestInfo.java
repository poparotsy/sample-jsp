package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestInfo
 */
@WebServlet("/RequestInfo")
public class RequestInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Request Information</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table>");
        
        out.println("<h3>Request Information</h3>");
        out.println("<tr><td>");
        out.println("Method: " + request.getMethod());
        out.println("</td></tr>");
        out.println("<tr><td>");
        out.println("Request URI: " + request.getRequestURI());
        out.println("</td></tr>");
        out.println("<tr><td>");
        out.println("Protocol: " + request.getProtocol());
        out.println("</td></tr>");
        out.println("<tr><td>");
        out.println("Remote Address: " + request.getRemoteAddr());
        out.println("</td></tr>");
        out.println("<tr><td>");
        out.println("Local Address: " + request.getLocalAddr());
        out.println("</td></tr>");
        out.println("<tr><td>");
        out.println("Session :" + request.getRequestedSessionId());
        out.println("</td></tr>");
        out.println("<tr><td>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
