package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        // HelloServlet.service
        System.out.println("request = " + request);
        // request = org.apache.catalina.connector.RequestFacade@599ed278
        System.out.println("request = " + request);
        // request = org.apache.catalina.connector.RequestFacade@599ed278

        String username = request.getParameter("username");
        System.out.println("username = " + username);
        // username = parkch

        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write("<h1>Hello World!</h1>");
    }
}

