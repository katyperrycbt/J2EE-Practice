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
@WebServlet("/DOMBook")
public class DOMBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DOMBook() {
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
		 out.println("<h1><center>List of Books </center></h1>");
		 out.println("<center><table border=1 cellpadding=0 bgcolor=#FFFFFF></center>");
		 out.println("<tr><td><b>ISBN-10</b></td> <td><b>TITLE</b></td> <td><b>AUTHOR</b></td> <td><b>PUBLISHER</b></td> <td><b>DATE</b></td><td><b>PRICE</b></td></tr>\r\n"
		 		+ "");
		DocumentBuilderFactory factory = 
		DocumentBuilderFactory.newInstance();
		 // Turn on namespace support
		 factory.setNamespaceAware(true);
		 // Create a JAXP document builder
		 DocumentBuilder parser = factory.newDocumentBuilder();
		 // Read the entire document into memory
		 Document document = parser.parse("C:/Users/PC/eclipse-workspace2/Web-Lab10/src/book.xml");
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
			String isbn = "";
			String title = "";
			String author = "";
			String publisher = "";
			String date = "";
			String price = "";

			for (int i = 0; i < childNodes.getLength(); i++) {
				Node child = childNodes.item(i);
				String nodeName = child.getLocalName();
				if (nodeName != null) {
					if (nodeName.equals("isbn")) {
						NodeList children = child.getChildNodes();
						Node dateNode = children.item(0);
						if (dateNode.getNodeType() == Node.TEXT_NODE) {
							isbn = dateNode.getNodeValue();
						}
					} else if (nodeName.equals("title")) {
						NodeList children = child.getChildNodes();
						Node dateNode = children.item(0);
						if (dateNode.getNodeType() == Node.TEXT_NODE) {
							title = dateNode.getNodeValue();
						}
					} else if (nodeName.equals("author")) {
						NodeList children = child.getChildNodes();
						Node priceNode = children.item(0);
						if (priceNode.getNodeType() == Node.TEXT_NODE) {
							author = priceNode.getNodeValue();
						}
					} else if (nodeName.equals("publisher")) {
						NodeList children = child.getChildNodes();
						Node priceNode = children.item(0);
						if (priceNode.getNodeType() == Node.TEXT_NODE) {
							publisher = priceNode.getNodeValue();
						}
					}else if (nodeName.equals("publicationdate")) {
						NodeList children = child.getChildNodes();
						Node priceNode = children.item(0);
						if (priceNode.getNodeType() == Node.TEXT_NODE) {
							date = priceNode.getNodeValue();
						}
					}else if (nodeName.equals("price")) {
						NodeList children = child.getChildNodes();
						Node priceNode = children.item(0);
						if (priceNode.getNodeType() == Node.TEXT_NODE) {
							price = priceNode.getNodeValue();
						}
					}
				}
			}
			out.print("<td>" + isbn + "</td>" + "<td>" + title + "</td>" + "<td>" + author + "</td>" + "<td>" + publisher
					+ "</td>"+ "<td>" + date + "</td>"+ "<td>" + price + "</td>");
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
