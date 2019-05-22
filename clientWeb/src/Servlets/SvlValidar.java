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
 * Servlet implementation class SvlValidar
 */
@WebServlet("/SvlValidar")
public class SvlValidar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlValidar() {
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
		HttpSession sessio;
		
		String codiLocal = request.getParameter("codiLocal");
		
		sessio = request.getSession(true);
		
		try{
			Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
			Facade.ServeiWeb port = service.getServeiWebPort();
			port.validaLocal(Integer.parseInt(codiLocal));
		}
		catch (Exception e) { e.printStackTrace();}
		System.out.print("entrada servlet validar1");
		try {
			System.out.print("entrada servlet validar2");
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/MissatgeValidat");
			rd.forward(request, response);
		}
		catch ( Exception e ) {e.printStackTrace();}
	}

}

