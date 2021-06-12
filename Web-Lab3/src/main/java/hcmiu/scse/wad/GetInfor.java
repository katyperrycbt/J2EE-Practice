package hcmiu.scse.wad;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetInfor
 */
@WebServlet("/GetInfor")
public class GetInfor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetInfor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("<h1 style=\"margin: auto; width: 50%;  text-align: center;\">Reading Personal Information</h1>");
		response.getWriter().println("<style>\r\n"
				+ "table, th, td {\r\n"
				+ "  border: 1px solid black;\r\n"
				+ "}\r\n"
				+ "</style><table style=\"margin: auto; width: 50%;  text-align: center;\">\r\n"
				+ "  <tr>\r\n"
				+ "    <td>ID</td>\r\n"
				+ "    <td>"+request.getParameter("id")+"</td>\r\n"

				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>Name</td>\r\n"
				+ "    <td>"+request.getParameter("name")+"</td>\r\n"

				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>Email</td>\r\n"
				+ "    <td>"+request.getParameter("email")+"</td>\r\n"
				+ "  </tr>\r\n"		
				+ "  <tr>\r\n"
				+ "    <td>Gender</td>\r\n"
				+ "    <td>"+request.getParameter("gender")+"</td>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>Major</td>\r\n"
				+ "    <td>"+request.getParameter("major")+"</td>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>Interesting Field</td>\r\n"
				+ "    <td>"+request.getParameter("field")+"</td>\r\n"
				+ "  </tr>\r\n"
				+ "</table>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
