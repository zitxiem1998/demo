import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/index")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = ListCustomer.queryDepartments();
        request.setAttribute("customers", customers);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");

        // Forward (Chuyển tiếp) yêu cầu, để hiển thị trên trang JSP.
        dispatcher.forward(request, response);
    }
}
