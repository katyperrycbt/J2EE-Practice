package hcmiu.scse.wad;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.xml.sax.SAXException;

/**
 * Servlet implementation class parseingxml
 */
@WebServlet("/DOMServlet")
public class DOMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DOMServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		 try {
		 // TODO output your page here
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<title>Servlet DOMServlet</title>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<h1><center>List of Students in Web Class </center></h1>");
		 out.println("<center><table border=1 cellpadding=0 bgcolor=#FFFFFF></center>");
		 out.println("<tr><td><b>Name</b></td> <td><b>ID</b></td> <td><b>DATE</b></td> <td><b>CITY</b></td> </tr>");
		DocumentBuilderFactory factory = 
		DocumentBuilderFactory.newInstance();
		 // Turn on namespace support
		 factory.setNamespaceAware(true);
		 // Create a JAXP document builder
		 DocumentBuilder parser = factory.newDocumentBuilder();
		 // Read the entire document into memory
		 Document document = parser.parse("C:/Users/PC/eclipse-workspace2/Web-Lab10/src/authors.xml");
		 // Obtain the root node of the tree
		 Node booklist = document.getDocumentElement();
		 NodeList books = booklist.getChildNodes();
		 int nBooks = books.getLength();
		 for (int i = 0; i < nBooks; i++) {
		 Node book = books.item(i);
		 if (book.getNodeType() != Node.TEXT_NODE) {
		 out.println("<tr>");
		printBook(book, out);
		out.println("</tr>");
		 }
		 }
		 out.println("</body>");
		 out.println("</html>");
		 } catch (SAXException ex) {
		 Logger.getLogger(DOMServlet.class.getName()).log(Level.SEVERE, 
		null, ex);
		 } catch (ParserConfigurationException ex) {
		 Logger.getLogger(DOMServlet.class.getName()).log(Level.SEVERE, 
		null, ex);
		 } finally {
		 out.close();
		 }
		 }

	private void printBook(Node book, PrintWriter out) {
		NamedNodeMap attributes = book.getAttributes();
		if (attributes != null) {
			NodeList childNodes = book.getChildNodes();
			String name = "";
			String id = "";
			String date = "";
			String city = "";
			for (int i = 0; i < childNodes.getLength(); i++) {
				Node child = childNodes.item(i);
				String nodeName = child.getLocalName();
				if (nodeName != null) {
					if (nodeName.equals("name")) {
						NodeList children = child.getChildNodes();
						Node dateNode = children.item(0);
						if (dateNode.getNodeType() == Node.TEXT_NODE) {
							name = dateNode.getNodeValue();
						}
					} else if (nodeName.equals("idNum")) {
						NodeList children = child.getChildNodes();
						Node dateNode = children.item(0);
						if (dateNode.getNodeType() == Node.TEXT_NODE) {
							id = dateNode.getNodeValue();
						}
					} else if (nodeName.equals("date-of-birth")) {
						NodeList children = child.getChildNodes();
						Node priceNode = children.item(0);
						if (priceNode.getNodeType() == Node.TEXT_NODE) {
							date = priceNode.getNodeValue();
						}
					} else if (nodeName.equals("city")) {
						NodeList children = child.getChildNodes();
						Node priceNode = children.item(0);
						if (priceNode.getNodeType() == Node.TEXT_NODE) {
							city = priceNode.getNodeValue();
						}
					}
				}
			}
			out.print("<td>" + name + "</td>" + "<td>" + id + "</td>" + "<td>" + date + "</td>" + "<td>" + city
					+ "</td>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public boolean isTextNode(Node n) {
		return n.getNodeName().equals("#text");
	}

}
