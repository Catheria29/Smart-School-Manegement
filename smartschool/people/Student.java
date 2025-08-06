package smartschool.people;

import java.util.*;

public class Student extends Person {
    public char gradeLevel;
    public ArrayList<String> course;
    public Student(int id, String name, String email,char gradeLevel, ArrayList<String> course) {
        super(id, name, email);
        this.gradeLevel = gradeLevel;
        this.course = course;
    }

    public void enrollCourse(String c){
        this.course.add(c);
    }
    public String displayInfo() {
        return "Id: " + this.id + "\nName: " + this.name + "\nEmail: " + this.email + "\nGrade Level: " + gradeLevel + "\nCourse: " + course;
    }


}