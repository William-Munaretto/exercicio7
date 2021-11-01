package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		List<Usuario> usuarios = new ArrayList<Usuario>();

		String login = req.getParameter("campo_login");
		String password = req.getParameter("campo_password");
		
		Usuario usuario1 = new Usuario();
		usuario1.login = "admin";
		usuario1.password = "admin";
		usuarios.add(usuario1);
		
		for (Usuario usuario : usuarios) {
			
			if(login.equals(usuario.login)) {
				
				if(password.equals(usuario.password)) {
					
					HttpSession session = req.getSession();
					
					session.setAttribute("usuario", "admin");
					session.setAttribute("estaLogado", true);
					session.setMaxInactiveInterval(5);
					
					resp.sendRedirect("/exercicio7/segura");
				}else {
				resp.sendRedirect("/exercicio7/index.jsp?msg=senha incorreta");
				//System.out.println("/exercicio7/index.jsp?msg=senha incorreta");
				}
			}else {
			
			resp.sendRedirect("/exercicio7/index.jsp?msg=login incorreto");
			//System.out.println("/exercicio7/index.jsp?msg=login incorreto");
			}
		}
	}
}
