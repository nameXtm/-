import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet("/index")
public class IndexServlet extends ViewBaseServlet {
    @Override

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        QueryRunnerTest queryRunnerTest1 = new QueryRunnerTest();
        Map<String, Object> list = null;
        try {
            list = (Map<String, Object>) queryRunnerTest1.Test01();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //保存到session的作用域
        HttpSession session = req.getSession();
        session.setAttribute("list", list);
        //视图命称：index
        //逻辑视图名称：index
        //物理视图名称： view-prefix + 逻辑视图名称 + view-suffix
        //所以真实的视图名称是： /         index        .html
        super.processTemplate("Index",req,resp);


    }
}
