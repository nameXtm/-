import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/edit.do")
public class EditServlet extends ViewBaseServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parameter = req.getParameter("fid");
        if (parameter != null && !"".equals(parameter)) {
            int parameter1 = Integer.parseInt("parameter");
            QueryRunnerTest queryRunnerTest = new QueryRunnerTest();
            List<Map<String, Object>> maps = queryRunnerTest.Test01();
            req.setAttribute("fruit",maps);
            super.processTemplate("edit",req,resp);

        }
//        String fname = req.getParameter("fname");
//        String price = req.getParameter("price");
//        Integer fname1 = Integer.getInteger("price");
//        String fcount = req.getParameter("fcount");
//        Integer fcount1 = Integer.getInteger("fcount");
//        String aggregate = req.getParameter("aggregate");

    }
}
