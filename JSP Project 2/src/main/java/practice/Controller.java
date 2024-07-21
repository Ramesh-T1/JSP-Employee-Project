package practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.UserModel;
import resource.Users;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
/*	@Resource(name="jdbc/project")
	private DataSource ds;*/

    public Controller() {
        super();

    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String p=request.getParameter("page");
		p=p.toLowerCase();
		switch(p)
		{
		  case "home":home(request,response);
		  break;
		  case "add user":adduser(request, response);
		  break;
		  case "show user":showuser(request, response);
		  break;
		  case "update user":request.getRequestDispatcher("/updateuser.jsp").forward(request, response);
		  break;
		  case "delete user":request.getRequestDispatcher("/deleteuser.jsp").forward(request, response);
		  break;
		  default:error(request, response);
		  break;

		}
	}

	public void home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	public void adduser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/adduser.jsp").forward(request, response);

	}
	public void showuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		List<Users> l1=new ArrayList<>();
		l1=new UserModel().show();
		request.setAttribute("listusers", l1);
		request.getRequestDispatcher("/showuser.jsp").forward(request, response);

	}
	public void error(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getRequestDispatcher("/error.jsp").forward(request, response);

	}

}
