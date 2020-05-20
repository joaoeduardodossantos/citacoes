package br.com.estudo.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contador
 */
@WebServlet("/contador")
public class Contador extends HttpServlet {
	private  int contador = 0; // variavel de instancia
		
      
     public void TesteServlet() {
         System.out.println("Instanciando uma Servlet  " + this);
     }

     @Override
     public void init() throws ServletException {
         super.init();
         System.out.println("Inicializando a servlet " + this);
         log("Iniciando a servlet");
     }

     @Override
     public void destroy() {
         super.destroy();
         System.out.println("Destruindo a servlet " + this);
         log("Finalizando a servlet");
     }
     
    @Override
    	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		contador++;
    		
    		// recebe o writter
    		PrintWriter out = resp.getWriter();
    		
    		// escreve o texto
    		out.println("<html>");
    		out.println("<body>");
    		out.println("<h2> Contador agora é: " + contador + "<h2>");
    		out.println("</body>");
    		out.println("</html>");
    		
    	}
	

   
}
