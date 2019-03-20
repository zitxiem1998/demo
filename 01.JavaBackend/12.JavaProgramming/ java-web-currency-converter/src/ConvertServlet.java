import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConvertServlet", urlPatterns = "/convert")
public class ConvertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate=Float.parseFloat(request.getParameter("rate"));
        float usd=Float.parseFloat(request.getParameter("usd"));

        float vnd=rate*usd;

        PrintWriter printWriter=response.getWriter();

        printWriter.println("<html>");
        printWriter.println("<h2>Rate: "+rate+"</h2>"+"<br/");
        printWriter.println("<h3>USD: "+usd+"</h3>"+"<br/");
        printWriter.println("<h4>VND: "+vnd+"</h4>"+"<br/");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
