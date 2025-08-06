package smartschool.people;
import java.util.*;

public class Teacher extends Person{
    String subject;
    ArrayList<String> course;
    public Teacher(int id, String name, String email, ArrayList<String> course, String subject){
        super(id, name, email);
        this.subject = subject;
        this.course = course;
    }

    public void assignCourse(String c){
        this.course.add(c);
    }
    public String displayInfo(){
        return "Id: " + this.id + "\nName: " + this.name + "\nEmail: " + this.email + "\nGrade Level: "  + "\nCourse: " + course + "\nSubject";

    }
}