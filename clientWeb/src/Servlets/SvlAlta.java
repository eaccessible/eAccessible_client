package Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import Facade.Local;
import Facade.Accessibilitat;


/**
 * Servlet implementation class SvlEntrada
 */
@WebServlet("/SvlEntrada")
public class SvlAlta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlAlta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doFer(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		doFer(request,response);
	}
	
	public void doFer(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("\nDins del servlet");
		HttpSession sessio;
		
		sessio = request.getSession(true);
		
		String nomLocal = request.getParameter("nomLocal");
		String nomCarrer = request.getParameter("nomCarrer");
		int codiCarrer = Integer.parseInt(request.getParameter("codiCarrer"));
		String nomVia = request.getParameter("nomVia");
		int numero = Integer.parseInt(request.getParameter("numero"));
		String observacions = request.getParameter("observacions");
		
		Local local = new Local();
		local.setNomlocal(nomLocal);
		local.setNomcarrer(nomCarrer);
		local.setCodicarrer(codiCarrer);
		local.setNomvia(nomVia);
		local.setNumero(numero);		
		local.setObservacions(observacions);
		
		Facade.Accessibilitat[] accessibilitats = null;
		
		
		try{
			Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
			Facade.ServeiWeb port = service.getServeiWebPort();
			port.altaLocal(local, accessibilitats);
		}
		catch (Exception e) { e.printStackTrace();}
		
		try {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/inici");
			rd.forward(request, response);
		}
		catch ( Exception e ) {e.printStackTrace();}
	}

}
