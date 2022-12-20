package model;

public class imagemod {
       private int id;
       private String image;

        public imagemod(int id,String image){
            this.id = id;
            this.image=image;    
        }
        public imagemod(String image){
            this.image = image;
        }
        public void setimage(String image){
            this.image=image;
        }
        public String getimage(){
            return this.image;
        }
    }



