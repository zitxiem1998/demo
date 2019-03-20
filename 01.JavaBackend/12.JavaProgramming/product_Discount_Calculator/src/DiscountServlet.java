import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));

        float discountAmount = (discountPercent * listPrice * 0.1F);

        PrintWriter printWriter=response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1> Discount Amount: " + discountAmount+"<br/>");
        printWriter.println("<h2> Discount Price: " + (listPrice-discountAmount));
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
