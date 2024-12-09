package Local_Bank;
import java.sql.*;

public class Bank_db {
    Connection cnt;
    Statement s;
    public Bank_db(){ // Constructor
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
            cnt = DriverManager.getConnection("jdbc:mysql://localhost:3306/Anurag?user=anurag&password=password");
            s = cnt.createStatement();
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
