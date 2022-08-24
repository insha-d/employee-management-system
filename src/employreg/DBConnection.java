/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package employreg;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GANESH
 */
public class DBConnection {
    Connection con;
    Statement smt;
    ResultSet rs;
    
    public DBConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/empdata", "root", "");
            smt = con.createStatement();
            System.out.print("Connected");
        } catch (Exception e) {
            System.out.print(e);
        }
    }
public void insertMethod(String qry)
{
  try
  {
    smt.execute(qry);
    System.out.println("success");
  }
  catch(Exception e)
  {
  System.out.print(e);
  }
}

  public void delMethod (String qry) 
          {
try
        {smt.execute(qry); 
         
}
catch(Exception e)
        {
     System.out.print(e);
}
}
  
public void updateMethod(String gry)

{

try 
{
    smt.executeUpdate(gry);
}
catch(Exception e) 
{ 
 System.out.print(e);
}

}

//for delete from db

public ResultSet selectMethod(String qry)

{

try
{
 rs=smt.executeQuery(qry);
}
catch(Exception e) 
{
     System.out.print(e);
}
return rs;
}
}
