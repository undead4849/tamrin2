import java.util.ArrayList;
public class Field {
    ArrayList<Course> Course=new ArrayList<Course>();
    ArrayList<Student> Student=new ArrayList<Student>();
    private String name;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public Field(String name){
       this.name=name;
    };
   public void setCourse(Course Course){
   this.Course.add(Course);
   };
   public void setStudent(Student Student){
   this.Student.add(Student);
   };
    
}
