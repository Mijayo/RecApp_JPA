package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.DAO.PreguntaDAOImpl;
//import modelo.DAO.eneagramaDAOImpl;
import modelo.beans.Pregunta;
import modelo.beans.Eneagrama;
/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		//Parametro a recibir
		String opcion = request.getParameter("validar");
		
		//El id y el array de values que vamos a recibir
		int id = 1;
		int total[];
		total = new int[9];
		
		
		switch(opcion) {
		
		case "eneagrama":
		//Inicializamos las preguntas

			PreguntaDAOImpl pdao = new PreguntaDAOImpl();
//			Pregunta pregunta;

			pdao.findByEneagrama(id);
			System.out.println(id);
			
			request.setAttribute("lista",pdao.findByEneagrama(id));
			request.getRequestDispatcher("Test.jsp").forward(request, response);
			
			
		break;
		case "aumentar":
			int idArray = id-1;
			//formalmente, guardará una suma de valores, no el idArray
			
			total[idArray] = idArray;
			id++;
			System.out.println(id + "it sort of works!");
	}}

}
