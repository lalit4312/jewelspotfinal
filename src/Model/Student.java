package model;

public class Student {
        private int id;
        private String Username;
        private String Email;
        private String Contact;
        private String password ;
        private String confirmPassword;
        
        
        public Student(int id,String Username,String Email,String Contact,String password,String confirmPassword){
            this.id=id;
            this.Username=Username;
            this.Email=Email;
            this.Contact=Contact;
            this.password=password;
            this.confirmPassword=confirmPassword;
            
        }
        public Student(String Username,String Email,String Contact,String password,String confirmPassword){
            
            this.Username=Username;
            this.Email=Email;
            this.Contact=Contact;
            this.password=password;
            this.confirmPassword=confirmPassword;
        }
        public void setid(int id){
            this.id=id;
        }
        public int getid(){
            return this.id;
        }
        public void setusername(String Username){
            this.Username=Username;
        }
        public void setemail(String Email){
            this.Email=Email;            
        }
        public void setcontact(String Contact){
            this.Contact=Contact;
        }
        public void setpassword(String Password){
            this.password=Password;
        }
        public void setconfirmPassword(String ConfirmPassword){
            this.confirmPassword=ConfirmPassword;
        }
        public String getusername(){
            return this.Username;
        }
        public String getemail(){
            return this.Email;
        }
        public String getcontact(){
            return this.Contact;
        }
        public String getpassword(){
            return this.password;
        }
        public String getconfirmPassword(){
            return this.confirmPassword;
       
        }
    }



