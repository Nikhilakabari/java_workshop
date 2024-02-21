import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id =req.getParameter("id");
		int id2 = Integer.parseInt(id);
		
		Model m = Dao.editdate(id2);
		
		out.print("<form.method ='post' action = 'EditServlet2'>");
		out.print("<p><input type ='hidden' name ='id' value = '"+m.getId()+"'></p>");
		out.print("<p><input type ='text' name ='name' value = '"+m.getName()+"'></p>");
		out.print("<p><input type ='text' name ='surname' value = '"+m.getSurname()+"'></p>");
		out.print("<p><input type ='text' name ='email' value = '"+m.getEmail()+"'></p>");
		out.print("<p><input type ='submit' name ='submit' value = 'update'></p>");
		
		out.print("</from>");
	}

}
