import java.sql.*;

class JdbcDemo
{
    public static void main(String args[])
    {
        int RecordCount=0;
        class.forName("oracle.jdbc.driver.oracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:raclexe","krishna","krishna");
        Statement stmt=con.createStatement();
        Resultset rs=stmt.excuateQuery("select Empno,Ename,sal from Emp");
        System.out.println("Ename" \t "Ename" \t "Sal");
        System.out.ptintln("---------------");
        while(rs.next()){
        Systm.out.println(rs.getString("Empno")+"\t"rs.getString("Ename")+"\t"rs.getString("Sal"));
        RecordCount++;
        }
        System.out.println(RecordCount+"row(s) selected");
        con.close();
    }
} 