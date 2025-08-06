package smartschool.core;
import smartschool.people.*;
import java.util.*;
public class Course {
    public String courseCode;
    public String title;
    public String teacher;
    public  ArrayList<Student> enrolledStudent ;// arraylist create a list of objects from a specific class and the class is written between <>;
    public Course(String courseCode,String title, String teacher, ArrayList<Student> enrolledStudent ){
        this.courseCode = courseCode;
        this.title = title;
        this.teacher = teacher;
        this.enrolledStudent = enrolledStudent;
    }

    public void addStudent(Student s){
        enrolledStudent.add(s);
    }

    public ArrayList<Student> listStudent(){
        return this.enrolledStudent;
    }
}