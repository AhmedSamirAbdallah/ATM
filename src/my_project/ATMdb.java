package my_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ATMdb {
    Connection connection =null;
    //Statement statment =null;
    //ResultSet result =null;
    public ATMdb(String connection , String username , String password) throws SQLException{
        this.connection=DriverManager.getConnection(connection, username,password);
    }
    public ResultSet select() throws SQLException{
        String query="Select password from ATM.users";
        ResultSet result =null;
        Statement statment;
        statment=connection.createStatement();
        result=statment.executeQuery(query);
        return result;   
       
    }
    public ResultSet select_data(String pass) throws SQLException{
            ResultSet result =null;
            Statement statement;
            String query="SELECT username,account_name , amount_of_money from ATM.USERS where password='"+pass+"'";
            statement=connection.createStatement();
            result=statement.executeQuery(query);
            return result;
        }
    public String select_balance(String pass) throws SQLException{
            ResultSet result =null;
            String bal="";
            Statement statement;
            String query="SELECT amount_of_money from ATM.USERS where password='"+pass+"'";
            statement=connection.createStatement();
            result=statement.executeQuery(query);
            while(result.next())
                bal= result.getString("amount_of_money");
            return bal;
        }
   
    
    public void Update_to_deposit(String pass, String balance) throws SQLException
    {
        Statement statement;
        String res="";
        String deposite="";
        res=this.select_balance(pass);
        deposite=String.valueOf(Integer.parseInt(balance)+Integer.parseInt(res));
        String query = "update ATM.USERS set amount_of_money='"+deposite+"'where password='"+pass+"'";
        
        try
        {
            statement = connection.createStatement();
            statement.executeUpdate(query);
        }
        
        catch(SQLException error)
        {
            System.out.println("Error while connecting to the database");
        }
    }
    public void Update_to_withdrawl(String pass, String balance) throws SQLException
    {
        Statement statement;
        String res="";
        String withdrawl="";
        res=this.select_balance(pass);
        int num=(Integer.parseInt(res)-Integer.parseInt(balance));
        if(num>0){
            withdrawl=String.valueOf(num);
        String query = "update ATM.USERS set amount_of_money='"+withdrawl+"'where password='"+pass+"'";
        statement = connection.createStatement();
        statement.executeUpdate(query);
        }
        else{
            my_project.My_project.atm.cannot_withdrawl();
        }
           
        
    }
    public boolean Login(String password) throws SQLException
    {
        ResultSet result = this.select();

        while(result.next())
        {
            if(password.equals(result.getString("password")) )
            {
                return true;
            }
        }

        return false;
    }
    public String show_data(ResultSet data) throws SQLException{
        return(data.getString("password"));
    }
}
