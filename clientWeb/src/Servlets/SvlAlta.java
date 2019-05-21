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
 * Servlet implementation class SvlAlta
 */
@WebServlet("/SvlAlta")
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
		System.out.println("\nDins del servlet Alta!");
		HttpSession sessio;
		
		String codiTipoLocal = request.getParameter("codiTipoLocal");
		
		String nomLocal = request.getParameter("nomLocal");
		String nomVia = request.getParameter("nomVia");
		String codiCarrer = request.getParameter("codiCarrer");
		String nomCarrer = request.getParameter("nomCarrer");
		String numero = request.getParameter("numero");
		String observacions = request.getParameter("observacions");
		String caracteristiquesLength = request.getParameter("caracteristiquesLength");

		
		String caracteristicaValor[][] = new String[Integer.parseInt(caracteristiquesLength)][2];
		
		for(int i=0; i<Integer.parseInt(caracteristiquesLength); i++){
			caracteristicaValor[i][0] = request.getParameter("codiCaracteristica"+i);
			caracteristicaValor[i][1] = request.getParameter("valor"+i);
		}
		
		sessio = request.getSession(true);
		
		int codiLocalLliure = 0;
		int codiAccessibilitatLliure = 0;
		
		try{
			Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
			Facade.ServeiWeb port = service.getServeiWebPort();
			codiLocalLliure = port.codiLocalLliure();
		}
		catch (Exception e) { e.printStackTrace();}
		
		System.out.println("codilocallliure: "+ codiLocalLliure);
		
		try{
			Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
			Facade.ServeiWeb port = service.getServeiWebPort();
			codiAccessibilitatLliure = port.codiAccessibilitatLliure();
		}
		catch (Exception e) { e.printStackTrace();}
		
		System.out.println("codiaccessibilitatlliure: "+ codiAccessibilitatLliure);
		
		Facade.Local local = new Facade.Local();
		
		local.setCodilocal(codiLocalLliure);
		local.setCoditipolocal(Integer.parseInt(codiTipoLocal));
		local.setCodicarrer(Integer.parseInt(codiCarrer));
		local.setNomcarrer(nomCarrer);
		local.setNomvia(nomVia);
		local.setNumero(Integer.parseInt(numero));
		local.setNomlocal(nomLocal);
		local.setObservacions(observacions);
		local.setVerificat("N");
		
		Facade.Accessibilitat[] llistaAccessibilitat = new Facade.Accessibilitat[Integer.parseInt(caracteristiquesLength)];
		
		for(int i=0; i<Integer.parseInt(caracteristiquesLength); i++){
			
			llistaAccessibilitat[i] = new Facade.Accessibilitat();
			
			llistaAccessibilitat[i].setCodilocal(codiLocalLliure);
			llistaAccessibilitat[i].setCodiaccessibilitat(codiAccessibilitatLliure);
			llistaAccessibilitat[i].setCodicaracteristica(Integer.parseInt(caracteristicaValor[i][0]));
			llistaAccessibilitat[i].setValor(Integer.parseInt(caracteristicaValor[i][1]));
			llistaAccessibilitat[i].setVerificat("N");

			codiAccessibilitatLliure = codiAccessibilitatLliure+1;
		}
		try{
			Facade.ServeiWebServiceLocator service = new Facade.ServeiWebServiceLocator();
			Facade.ServeiWeb port = service.getServeiWebPort();
			port.altaLocal(local, llistaAccessibilitat);
		}
		catch (Exception e) { e.printStackTrace();}
		
		sessio.setAttribute("nomLocal", nomLocal);
		try {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/AltaCorrecta");
			rd.forward(request, response);
		}
		catch ( Exception e ) {e.printStackTrace();}
		
	}

}
