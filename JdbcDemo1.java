import java.sql.*;
import java.io.*;
class JdbcDemo1
{
    public static void main(String args[]) throws Exception
    {
        Connection con;
        Statement stmt;
        BufferedReader dataReader;
        String Deptno,Dname,Loc;
        String InsertStr;
        System.out.println("connection to the DB server");
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","krishna","krishna");
        stmt=con.createStatement();
        System.out.println("connection obtained...");
        System.out.println("perparing to read the data..");
        dataReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value..");
        System.out.print("\t Deptno");
        Deptno=dataReader.readLine();
        System.out.print("\t Dname");
        Dname=dataReader.readLine();
        System.out.print("\t Loc");
        Loc=dataReader.readLine();
        InsertStr="Insert into dept values("+Deptno+",'"+Dname+"','"+Loc+"')";
        int Result=stmt.executeUpdate(InsertStr);
        if(Result==1)
            System.out.println("Sucesss");
        else
            System.out.println("Sorry..");
        
    }
} 