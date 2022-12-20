package controller;
import database.DbConnection;
import model.*;


public class contactController{
    DbConnection dbconnection;
    public int insertContactinfo(Contactinfo contact){
        String entername=contact.getentername();
        String entercontact=contact.getentercontact();
        String entermessage=contact.getentermessage();
        String insertQuery=String.format("INSERT INTO con_tact VALUES('%s','%s','%s')",entername,entercontact,entermessage);
        dbconnection=new DbConnection();
        int result=dbconnection.manipulate(insertQuery);
        return result;
    }
}
  