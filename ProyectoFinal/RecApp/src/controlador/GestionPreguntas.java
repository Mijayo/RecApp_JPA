package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.DAOS.PreguntaDAOImpl;
import modelo.beans.Pregunta;

/**
 * Servlet implementation class GestionPreguntas
 */
@WebServlet("/GestionPreguntas")
public class GestionPreguntas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GestionPreguntas() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String[] tipos = { "Reformador", "Ayudador", "Triunfador", "Individualista", "Investigador", "Leal",
				"Entusiasta", "Desafiador", "Pacificador" };

		PreguntaDAOImpl pdao = new PreguntaDAOImpl();

		HttpSession sesionQuestion = request.getSession();

		switch (request.getParameter("option")) {

		case "question":

			sesionQuestion.setAttribute("id", 1);

			Integer tipoEneagrama = (Integer) sesionQuestion.getAttribute("id");

			System.out.println(tipoEneagrama);

			if (tipoEneagrama == 1) {

				List<Pregunta> lista = pdao.findByTipoEneg(tipoEneagrama);

				System.out.println(lista);

				request.setAttribute("preguntas", lista);

				sesionQuestion.setAttribute("preguntas", lista);

				tipoEneagrama = tipoEneagrama + 1;
				
				System.out.println(tipoEneagrama);

			} else {

				List<Pregunta> lista = pdao.findByTipoEneg(tipoEneagrama + 1);

				request.setAttribute("preguntas", lista);

				sesionQuestion.setAttribute("preguntas", lista);

				// tipoEneagrama++;
			}

			request.getRequestDispatcher("question.jsp").forward(request, response);

			break;
		}

	}

}
