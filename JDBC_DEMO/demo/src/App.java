import java.sql.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/name", "root", "root123");
            Statement myStmt = myCon.createStatement();
            ResultSet myRes = myStmt.executeQuery("select * from items");
            System.out.println(myRes);
            myCon.close();
        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
