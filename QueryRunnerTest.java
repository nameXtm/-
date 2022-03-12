import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


public class QueryRunnerTest {

@Test
    public List<Map<String, Object>> Test01()  {
        QueryRunner queryRunner = new QueryRunner();

        Connection conn = JDBCutils01.getConnection3();
            String sql = "select *  from test01";
            MapListHandler mapListHandler = new MapListHandler();
    List<Map<String, Object>> list = null;
    try {
        list = queryRunner.query(conn, sql, mapListHandler);
    } catch (SQLException e) {
        e.printStackTrace();
    }
    list.forEach(System.out::println);
    try {
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;


        }
    public List<Map<String, Object>> Test02()  {
        QueryRunner queryRunner = new QueryRunner();

        Connection conn = JDBCutils01.getConnection3();
        String sql = "select *  from test01 where fid = ?";
        MapListHandler mapListHandler = new MapListHandler();
        List<Map<String, Object>> list = null;
        try {
            list = queryRunner.query(conn, sql, mapListHandler);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        list.forEach(System.out::println);
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;


    }
    public void Test03() {
        QueryRunner queryRunner = new QueryRunner();

        Connection conn = JDBCutils01.getConnection3();
        String sql = "update test01 set 名称 =? 单价 =? 数量 =?小计 =? where fid = ?";

        try {
            int update = queryRunner.update(conn, sql, "", "", "", "", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    }


