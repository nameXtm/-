import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/update.do")
public class updataServlet extends ViewBaseServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        QueryRunnerTest queryRunnerTest = new QueryRunnerTest();
        queryRunnerTest.Test03();
        String fname = req.getParameter("fname");
        String price = req.getParameter("price");
        Integer fname1 = Integer.getInteger("price");
        String fcount = req.getParameter("fcount");
        Integer fcount1 = Integer.getInteger("fcount");
        String aggregate = req.getParameter("aggregate");

//        super.processTemplate("index",req,resp);
        //需要输出重定向
        resp.sendRedirect("index");

    }
}
