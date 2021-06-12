package hcmiu.scse.wad;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import java.io.File;  // Import the File class
import java.io.FileWriter;

/**
 * Servlet implementation class FileUploader
 */
@WebServlet("/FileUploader")
@MultipartConfig

public class FileUploader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUploader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	    Part filePart = request.getPart("upfile"); // Retrieves <input type="file" name="file">
	    String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
	    InputStream fileContent = filePart.getInputStream();
	    
//	    response.getWriter().println("uploadfile"+fileContent);
//	    response.getWriter().println("file name"+fileName);
	    // ... (do your job here)
	    
		File file = new File(request.getServletContext().getRealPath("/WEB-INF/uploads/" + fileName));
		String isOverrideChecked = request.getParameter("override");
		
		System.out.println(request.getServletContext().getRealPath("/WEB-INF/uploads/" + fileName));
		if (file.exists()) {
			
			response.getWriter().println("File already existed!");
			if (isOverrideChecked != null) {
				File newFile = new File(request.getServletContext().getRealPath("/WEB-INF/uploads/" + fileName));
				response.getWriter().println("And override checked!");
				response.getWriter().println("File created: " + newFile.getName());
				FileWriter myWriter = new FileWriter(fileName, false);
			    myWriter.write(fileContent.toString());
			    myWriter.close();
			    response.getWriter().println("Overridded...");
			} else {
				response.getWriter().println("And override NOT checked! Process done...");
			}
		} else {
			response.getWriter().println("New file detected and creating new file...");
			
			try {
				File newFile = new File(request.getServletContext().getRealPath("/WEB-INF/uploads/" + fileName));
				if (newFile.createNewFile()) {
					response.getWriter().println("File created: " + newFile.getName());
					FileWriter myWriter = new FileWriter(fileName);
				    myWriter.write(fileContent.toString());
				    myWriter.close();
				    response.getWriter().println("Done...");
			      } else {
					 response.getWriter().println("File already existed!");
			    	 if (isOverrideChecked != null) {
							response.getWriter().println("And override checked!");
							response.getWriter().println("File created: " + newFile.getName());
							FileWriter myWriter = new FileWriter(fileName, false);
						    myWriter.write(fileContent.toString());
						    myWriter.close();
						    response.getWriter().println("Overridded...");
						} else {
							response.getWriter().println("And override NOT checked! Process done...");
						}
			      }
			} catch (IOException e) {
				e.printStackTrace();
				response.getWriter().println(e);
			}
		}
	}

}
