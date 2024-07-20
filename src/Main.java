import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String sql = "select name from productdetails where id = 2";
        String url = "jdbc:postgresql://localhost:5432/JavaConnectJDBC";
        String username = "postgres";
        String password = "root123";

        Connection cnctn = DriverManager.getConnection(url, username, password);
        Statement st = cnctn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        String name = rs.getString(1);
        System.out.println(name);
    }
}