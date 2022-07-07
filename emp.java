import java.sql.*;
public class emp 
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("succes");
            String url="jdbc:oracle:thin:@localhost:1521:XE";
            String uname="system";
            String pass="apk012";
            Connection conn=DriverManager.getConnection(url,uname,pass);
            System.out.println("succes");
            Statement smt=conn.createStatement();
     
            ResultSet rs=smt.executeQuery("select * from emp where empsal<2000 and empsal>1000");
            while(rs.next())
            {
                System.out.println(rs.getString("empno")+""+rs.getString("empname")+""+rs.getString("empsal"));
                
            }
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println("e");
        }
    }
}