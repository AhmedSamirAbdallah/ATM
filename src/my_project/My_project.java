package my_project;
import java.sql.ResultSet;
import java.sql.SQLException;
public class My_project {
      public static ATMGUi atm;
      public static ATMdb db;
    public static void main(String[] args) throws SQLException {
         atm =new ATMGUi();
        atm.show();
        String connection="jdbc:derby://localhost:1527/ATMDB";
        String password="atm";
        String username="atm";
         db=new ATMdb(connection,username, password); 
    }}

