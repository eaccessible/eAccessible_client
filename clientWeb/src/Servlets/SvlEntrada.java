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
import Facade.TipoLocal;


/**
 * Servlet implementation class SvlEntrada
 */
@WebServlet("/SvlEntrada")
public class SvlEntrada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlEntrada() {
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
		
		String codiTipoLocal = request.getParameter("codiTipoLocal");
		
		String nomLocal = request.getParameter("nomLocal");	
		
		sessio = request.getSession(true);
				
		Facade.Local[] locals = null;
		
		if(!nomLocal.isEmpty() && !codiTipoLocal.isEmpty()) {
			try{
				Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
				Facade.ServeiWeb port = service.getServeiWebPort();
				locals = port.infoLocalPerNomLocalICodiTipoLocal(nomLocal,Integer.parseInt(codiTipoLocal));
			}
			catch (Exception e) { e.printStackTrace();}
			
		}else if(!nomLocal.isEmpty()) {
			try{
				Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
				Facade.ServeiWeb port = service.getServeiWebPort();
				locals = port.infoLocalPerNomLocal(nomLocal);
			}
			catch (Exception e) { e.printStackTrace();}
			
		}else if(!codiTipoLocal.isEmpty()) {
			try{
				Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
				Facade.ServeiWeb port = service.getServeiWebPort();
				locals = port.infoLocalPerTipoLocal(Integer.parseInt(codiTipoLocal));
			}
			catch (Exception e) { e.printStackTrace();}
		}	
		sessio.setAttribute("Locals", locals);
		
		try {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/inici");
			rd.forward(request, response);
		}
		catch ( Exception e ) {e.printStackTrace();}
	}
}
