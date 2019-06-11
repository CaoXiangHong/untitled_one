package cn.hb.mr;

import java.sql.*;

public class jdbcTest {
    public static void main(String[] args) throws Exception {

        Class.forName("org.mariadb.jdbc.Driver");

        String url = "jdbc:mariadb://139.9.35.122:3306/Clothing";
        String use = "root";
        String psd = "ME@CS2101";

        Connection conn = DriverManager.getConnection(url, use, psd);
        String sql = "update dat_sale set saleprice = 288.00 where ID = 1";
        String sql2 = "select * from dat_sale  where ID = 1";

        Statement stmt = conn.createStatement();

        int count = stmt.executeUpdate(sql);
        System.out.println(count);

        ResultSet rst = stmt.executeQuery(sql2);
        rst.next();
        String  ID = rst.getString(11);
        System.out.println(ID);


  /*
        ResultSet rs = stmt.executeQuery(sql2);
        System.out.println(rs.getString(1));
*/
        stmt.close();
        conn.close();



    }
}
