package Controller;
import java.util.List;
import model.profilemod;
import database.DbConnection;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.util.ArrayList;
//import model.Student;



public class ProfileController{
    DbConnection dbconnection;
    
    public int updateprofilemod(int id,String username,String email,String contact ){
            int Id = id;
            String Username = username;
            String Email = email;
            String Contact= contact;       
            String updateQuery = String.format("UPDATE register SET  username = '%s' , email = '%s', contact = '%s' WHERE id = %d " ,Username,Email,Contact,Id);
            dbconnection = new DbConnection();
            int result = dbconnection.manipulate(updateQuery);
            return result;  
    }
   
    public List <profilemod> getalldetails(){
        List < profilemod > detail = new ArrayList<>();
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String query = ("Select * from register ");
            JdbcRowSet rowset = RowSetProvider.newFactory().createJdbcRowSet();
            try{
            rowset.setUrl("jdbc:mysql://db4free.net:3306/jewelspots");  
            rowset.setUsername("jewelspots");  
            rowset.setPassword("jewelspots");  
            rowset.setCommand("select * from register");  
            rowset.execute();
            
            while (rowset.next()) {
                    profilemod boom = new profilemod();
                    boom.setid(Integer.parseInt(rowset.getString(1)));
                    boom.setusername((rowset.getString(2)));
                    boom.setemail(rowset.getString(3));
                    boom.setcontact(rowset.getString(4));
                    detail.add(boom); 
                    System.out.println("Id: " + rowset.getString(1));  
                    System.out.println("Name: " + rowset.getString(2));
            }
            
            }
            catch(Exception e){
                    System.out.println(e);
            } 
            }
            catch(Exception e){
                System.out.println(e);

            }
            return detail;
    }
    
}
