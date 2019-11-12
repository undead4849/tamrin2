
public class Course {
     private String name;
     private int unit;
     private int capacity;
     
     public void setName(String name){
       this.name=name;
     };
     public void setUnit(int unit){
       this.unit=unit;
     };  
    public void setCapacity(int capacity){
       this.capacity=capacity;
     };
    public String getName(){
    return name;
    };
     public int getunit(){
    return unit;
    };
     public int capacity(){
    return capacity;
    };
     public Course(String name,int uint,int capacity){
     this.capacity=capacity;
     this.name=name;
     this.unit=unit;
     };
    
}
