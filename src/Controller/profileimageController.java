package controller;
import database.DbConnection;
import model.imagemod;
import model.profilemod;

public class profileimageController{
    DbConnection dbconnection;
   public int updateimagemod(profilemod student){
        int id = student.getid();
        String image = student.getimage();
        String insertQuery=String.format("INSERT INTO tbl_profile VALUES(%d,'%s')",id,image);
        dbconnection=new DbConnection();
        int result=dbconnection.manipulate(insertQuery);
        return result;
    }

    public int insertimagemod(imagemod ig) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    
