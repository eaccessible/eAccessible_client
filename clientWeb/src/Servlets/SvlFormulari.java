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
 * Servlet implementation class SvlFormulari
 */
@WebServlet("/SvlFormulari")
public class SvlFormulari extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlFormulari() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doFer(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		doFer(request, response);
	}
	
	public void doFer(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("\nDins del servlet Formulari");
		HttpSession sessio;
		
		String codiTipoLocal = request.getParameter("codiTipoLocal");
		
		sessio = request.getSession(true);
		
		Facade.CaracteristicaTipoLocal[] caracteristicaTipoLocal = null;
		
		
		try{
			Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
			Facade.ServeiWeb port = service.getServeiWebPort();
			caracteristicaTipoLocal = port.infoCaracteristicaTipoLocal(Integer.parseInt(codiTipoLocal));
		}
		catch (Exception e) { e.printStackTrace();}
		
		Facade.Caracteristica[] caracteristiques = new Facade.Caracteristica[caracteristicaTipoLocal.length];
		for(int i = 0; i<caracteristicaTipoLocal.length; i++) {
			try{
				Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
				Facade.ServeiWeb port = service.getServeiWebPort();
				caracteristiques[i] = port.infoCaracteristica(caracteristicaTipoLocal[i].getCodicaracteristica());
			}catch (Exception e) { e.printStackTrace();}
		}
		
		sessio.setAttribute("caracteristiques", caracteristiques);
		sessio.setAttribute("codiTipoLocal", codiTipoLocal);
		try {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/Formulari");
			rd.forward(request, response);
		}
		catch ( Exception e ) {e.printStackTrace();}
		
	}

}
