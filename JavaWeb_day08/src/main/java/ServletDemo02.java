import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * servlet生命周期介绍
 */
@WebServlet("/demo02")
public class ServletDemo02 implements Servlet {

    /**
     * 初始化服务
     * 被调用一次
     * 调用时机：d第一次创建servlet对象时候
     * @param servletConfig
     * @throws ServletException
     */
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init被调用...");

    }

    /**
     * 提供服务
     * 调用多次
     * 调用时机 每次servlet被访问时候
     * @return
     */
    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("123");
    }

    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 1. 调用时机：n内存释放或者服务关闭的时候，servlet对象会被销毁，调用
     * 2：调用次数 ： 1次
     *
     */
    public void destroy() {
        System.out.println("destroy...");
    }
}
