package SqlTest;

/**
 * Created by JackDan9 on 2017/9/17.
 */
import java.sql.*;
public class SqlTest {
    public static void main(String args[]) {
        java.sql.PreparedStatement ps = null;
        java.sql.Connection cn = null;
        ResultSet rs = null;

        try {
            // Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            cn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test?user=root&password=admin&useUnicode=true&characterEncoding=UTF-8"
            );
            ps = cn.prepareStatement("INSERT into users(USERNAME, PASSWORD, PHONE, EMAIL) VALUES (?, ?, ? ,?);");

            ps.setString(1, "wjb");
            ps.setString(2, "wjb");
            ps.setString(3, "wjb");
            ps.setString(4, "wjb");

            int i = ps.executeUpdate();
            System.out.println(i);
            if( i >= 1) {
                System.out.println("新增: 成功!");
            } else {
                System.out.println("新增: 失败!");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
