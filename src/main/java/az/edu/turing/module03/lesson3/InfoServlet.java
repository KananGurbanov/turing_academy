package az.edu.turing.module03.lesson3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        String name = req.getParameter("name");

        try {
            if(pathInfo == null || pathInfo.equals("/")){
                resp.getWriter().println("Hello World!");
            }
            else if(pathInfo.equals("/me")){
                resp.getWriter().println("Kanan Gurbanov");
            }
            else if(pathInfo.equals("/greetings")){
                if(name != null)resp.getWriter().println("Hello " + name);
                else resp.getWriter().println("Hello JavaEE");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
