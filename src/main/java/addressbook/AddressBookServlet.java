package addressbook;

// Samyak

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddressBookServlet extends HttpServlet {
	AddressBook book = new AddressBook();
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		String FirstName = request.getParameter("FirstName");
		String phoneNumber = request.getParameter("Phone");
		
		
		book.addEntry(FirstName, phoneNumber);
		
		response.getWriter().println("Added " + FirstName + ", there are now " + book.size() + " Entries...");
	}
		

}
