package hcmiu.scse.wad;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetThreeParam
 */
@WebServlet("/GetThreeParam")
public class GetThreeParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetThreeParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("<h1 style=\"margin-left: 500px;\">Reading Three Request Parameter</h1>");
		response.getWriter().println("<li><strong>param1</strong>: " + request.getParameter("firstPara") + "</li>");
		response.getWriter().println("<li><strong>param1</strong>: " + request.getParameter("secondPara") + "</li>");
		response.getWriter().println("<li><strong>param1</strong>: " + request.getParameter("thirdPara") + "</li>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
