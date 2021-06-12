package hcmiu.scse.wad;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterCourse
 */
@WebServlet("/RegisterCourse")
public class RegisterCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterCourse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("<h1 style=\"margin: auto; width: 50%;  text-align: center;\">Register Course</h1>");
		response.getWriter().println("<style>\r\n"
				+ "table, th, td {\r\n"
				+ "  border: 1px solid black;\r\n"
				+ "}\r\n"
				+ "</style><table style=\"margin: auto; width: 50%;  text-align: center;\">\r\n"
				+ "  <tr>\r\n"
				+ "    <td>Full Name</td>\r\n"
				+ "    <td>"+request.getParameter("fullname")+"</td>\r\n"

				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>ID</td>\r\n"
				+ "    <td>"+request.getParameter("id")+"</td>\r\n"

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
				+ "    <td>Field</td>\r\n"
				+ "    <td>"+request.getParameter("field")+"</td>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>Subjects</td>\r\n"
				+ "    <td>"+(request.getParameter("subject1") != null ? request.getParameter("subject1") + ", " : ' ')
				+ (request.getParameter("subject2") != null ? request.getParameter("subject2") + ", " : ' ')
				+(request.getParameter("subject3") != null ? request.getParameter("subject3") + ", " : ' ')
				+(request.getParameter("subject4") != null ? request.getParameter("subject4") + ", " : ' ')
				+"</td>\r\n"
				+ "  </tr>\r\n"
				+ "  <tr>\r\n"
				+ "    <td>Comments</td>\r\n"
				+ "    <td>"+request.getParameter("comments")+"</td>\r\n"
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
