package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SvlEliminar
 */
@WebServlet("/SvlEliminar")
public class SvlEliminar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlEliminar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doFer(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doFer(request, response);
	}
	
	public void doFer(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("entra al dofer");
		
		HttpSession sessio;
		
		String codiLocal = request.getParameter("codiLocal");
		
		sessio = request.getSession(true);
		
		try{
			Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
			Facade.ServeiWeb port = service.getServeiWebPort();
			port.baixaLocal(Integer.parseInt(codiLocal));
		}
		catch (Exception e) { e.printStackTrace();}
		
		try {
			System.out.println("entrada al segon try catch");
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/MissatgeEliminat");
			rd.forward(request, response);
		}
		catch ( Exception e ) {e.printStackTrace();}
	}
	

}
