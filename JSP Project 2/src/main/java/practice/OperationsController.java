package practice;

import java.io.IOException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.UserModel;
import resource.Users;

/**
 * Servlet implementation class OperationsController
 */
public class OperationsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/*@Resource(name="jdbc/project")
	private DataSource ds;  */
    public OperationsController() {
        super();
        // TODO Auto-generated constructor stub
    }
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String q=request.getParameter("addform");
		q=q.toLowerCase();
		switch(q)
		{
		  case "addentry":
			  String u=request.getParameter("username");
			  String em=request.getParameter("email");
			  Users newuser=new Users(u,em);
			  addentry(request, response,newuser);
			  break;
		}
	}
	private void addentry(HttpServletRequest request, HttpServletResponse response,Users nw) throws ServletException, IOException
	{
		new UserModel();
		UserModel.add(nw/*,ds*/);
		return;
	}
	public void error(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/error.jsp").forward(request, response);

	}

}
