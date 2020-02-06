package mines.douai.alejandra.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mines.douai.alejandra.bean.ModelBean;

/**
 * Servlet implementation class JSPServlet
 */
@WebServlet("/JSPServlet")
public class JSPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSPServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("name")== null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("error.jsp"); 
			requestDispatcher.forward(request, response); // Passer la request et response a une nouvelle dispatcher
		}else {
			String name = request.getParameter("name");
			ModelBean  bean = new ModelBean();
			bean.setName(name);
			request.setAttribute("myBean", bean);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			/// test
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
