package az.edu.turing.module03.lesson3;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class InfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (OutputStream os = resp.getOutputStream()) {
            os.write("Hello, World!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
