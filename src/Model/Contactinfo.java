
package model;

public class Contactinfo {
        private String entername;
        private String entercontact;
        private String entermessage;
        

        public Contactinfo(String entername,String entercontact,String entermessage){
            this.entername=entername;
            this.entercontact=entercontact;
            this.entermessage=entermessage;
            
        }
        public void setentername(String entername){
            this.entername=entername;
        }
        public void setentercontact(String entercontact){
            this.entercontact=entercontact;            
        }
        public void setentermessage(String entermessage){
            this.entermessage=entermessage;
        }
        
        public String getentername(){
            return this.entername;
        }
        public String getentercontact(){
            return this.entercontact;
        }
        public String getentermessage(){
            return this.entermessage;
        }   
    }



