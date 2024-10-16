package az.edu.turing.module3.lesson3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GreetingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String message = getGreetingMessage(name);
        resp.getWriter().println(message);
    }

    private String getGreetingMessage(String name) {
        return (name == null || name.trim().isEmpty()) ? "Hello, Java EE" : "Hello " + name;
    }

}
