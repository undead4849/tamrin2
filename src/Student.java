
public class Student {
   private String fname;
   private String lname;
   private int id;
   public Student(String fname,String lname,int id){
   this.fname=fname;
   this.lname=lname;
   this.id=id;
   };
   public void setfname(String fname){
   this.fname=fname;
   };
    public void setlname(String lname){
   this.lname=lname;
   };
     public void setId(int id){
         if(id>0)
   this.id=id;
         System.out.print("the number is wrong ");
   };
     public String getfname(){
     return fname;
     };
      public String getlname(){
     return lname;
     };
     public int getId(){
     return id;
     };
}
