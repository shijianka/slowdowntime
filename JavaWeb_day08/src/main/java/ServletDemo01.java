import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/demo01")
public class ServletDemo01 implements Servlet {

    public void init(ServletConfig servletConfig) throws ServletException {


    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("123");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
