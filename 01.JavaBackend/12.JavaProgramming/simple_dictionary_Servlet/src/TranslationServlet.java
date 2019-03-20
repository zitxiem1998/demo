import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServlet", urlPatterns = "/translate")
public class TranslationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dic=new HashMap<>();

        dic.put("hello", "xin chao");
        dic.put("book","sach vo");
        dic.put("table", "ban hoc");
        dic.put("student", "hoc sinh");

        String seach=request.getParameter("seach");

        PrintWriter printWriter=response.getWriter();

        printWriter.println("<html>");
        String result =dic.get(seach);

        if(result!=null) {
            printWriter.println("Word : " +seach+"<br/>");
            printWriter.println("Result: "+result+"<br/>");
        }
        else {
            printWriter.println("Not Found");
        }
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
