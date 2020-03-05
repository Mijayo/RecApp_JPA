package controlador;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOS.UsuarioDAOImpl;
import modelo.beans.Eneagrama;
import modelo.beans.Usuario;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UsuarioDAOImpl udao = new UsuarioDAOImpl();
		Usuario usu = null;
		Eneagrama ene = new Eneagrama();

		switch (request.getParameter("option")) {

			case "validar":
	
				usu = udao.findLogin(request.getParameter("email"), request.getParameter("pwd"));
	
				request.getSession().setAttribute("usuario", usu);
	
				request.getRequestDispatcher("index.jsp").forward(request, response);
	
				break;
	
			case "registrar":
	
				System.out.println(request.getParameter("email"));
				System.out.println(request.getParameter("nombre"));
				System.out.println(request.getParameter("pwd"));
	
				int autoIncrement = 0;
	
				usu = new Usuario(autoIncrement, request.getParameter("email"), new Date(), request.getParameter("nombre"),
						request.getParameter("pwd"), ene);
	
				if (udao.insert(usu) != 0) {
	
					request.getSession().setAttribute("usuario", usu);
					request.getRequestDispatcher("index.jsp").forward(request, response);
	
				} else {
					request.setAttribute("mensaje_error", "ya existe ese usuario");
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}
	
				break;

		}

	}

}
