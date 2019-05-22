package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Classes.InfoLocal;
import Facade.ServeiWeb;


/**
 * Servlet implementation class SvlFitxa
 */
@WebServlet("/SvlFitxa")
public class SvlFitxa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlFitxa() {
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
		
		Facade.Local local = null;
		Facade.TipoLocal[] tipolocal = null;
		Facade.CaracteristicaValor[] caracteristicaValor = null;
		
		if (!codiLocal.isEmpty()) {
			try{
				Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
				Facade.ServeiWeb port = service.getServeiWebPort();
				local = port.infoLocalPerCodiLocal(Integer.parseInt(codiLocal));
				tipolocal = port.cercaTipoLocal();
				caracteristicaValor = port.infoCaracteristicaLocal(Integer.parseInt(codiLocal));
			}
			catch (Exception e) { e.printStackTrace();}

			InfoLocal infoLocal = new InfoLocal();
			for(int j=0; j<tipolocal.length; j++) 
			{
				if(local.getCoditipolocal() == tipolocal[j].getCoditipolocal()) 
				{
					infoLocal.setNomtipolocalca(tipolocal[j].getNomtipolocalca());
					infoLocal.setNomtipolocales(tipolocal[j].getNomtipolocales());
					infoLocal.setNomtipolocalen(tipolocal[j].getNomtipolocalen());
				}
			}
			sessio.setAttribute("Local", local);
			sessio.setAttribute("TipoLocal", infoLocal);
			sessio.setAttribute("CaracteristicaValor", caracteristicaValor);
			
		}else{
			sessio.setAttribute("Local", null);
		}

		
		try {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/Fitxa");
			rd.forward(request, response);
		}
		catch ( Exception e ) {e.printStackTrace();}

		}
	}