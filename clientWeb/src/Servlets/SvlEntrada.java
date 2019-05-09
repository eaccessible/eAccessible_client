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
		doFer();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		doFer();
	}
	
	public TipoLocal[] doFer() {
		// TODO Auto-generated method stub
		HttpSession sessio;
		
		Facade.TipoLocal[] tlResultat = null;
		try{
			Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
			Facade.ServeiWeb port = service.getServeiWebPort();
			tlResultat = port.cercaTipoLocal();
		}
		catch (Exception e) { e.printStackTrace();}
		
		return tlResultat;	
	}

}
