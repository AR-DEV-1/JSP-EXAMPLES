// ExampleServlet.java
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ExampleServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        // Java logic
        String message = "Hello from Java!";

        // Set the attribute to be accessed by JSP
        request.setAttribute("message", message);

        // Forward the request to the JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}
