//package Controller;
//
//import database.DbConnection;
//import java.sql.ResultSet;
//
//
//public class retrive {
//    public void UserData(){
//        String Email = jTextField1.getText();
//        String Pass=jTextField2.getText();
//        
//        DbConnection db= new DbConnection();
//        String querry=String.format("Select * from register where email='%s'", Email);
//        ResultSet result=db.retrieve(querry);
//        try{
//          while(result.next()){
//              String DbEmail= result.getString("email");
//              String DbPass=result.getString("ppassword");
//              
//              System.out.println(DbEmail);
//              System.out.println(DbPass);
//              if(Pass.equals(DbPass) && Email.equals(DbEmail)){
//                  
//        
//    }
//    
//}
