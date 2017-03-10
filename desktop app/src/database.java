/**
 * Created by ETCH on 3/6/2017.
 */

import java.sql.*;

public class database {

    Connection con=null;
    public ResultSet connectToDatabase (String query){
        ResultSet rs=null;
        Statement stmt=null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            //con = DriverManager.getConnection("jdbc:sqlserver://ETCH","hesham","0000");
            con = DriverManager.getConnection("jdbc:sqlserver://ETCH;databaseName=hospital ;integratedSecurity=true");
            //here sonoo is database name, root is username and password
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            /*while (rs .next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();*/
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;

    }
}