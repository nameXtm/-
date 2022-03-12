import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;


public class JDBCutils01 {


@Test
    public static Connection getConnection3()  {
        Properties properties = new Properties();
//        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jetbrains://idea/navigate/reference?project=javaSenior高级阶段&path=properties");
    FileInputStream is = null;
    try {
        is = new FileInputStream(new File("D:\\intellij代码文件\\javaSenior高级阶段\\date01\\src\\properties"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        DataSource dataSource = null;
        try {
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return conn;

    }
    @Test
    public void Test(){
        Connection connection3 = getConnection3();
        System.out.println(connection3);
    }


}

