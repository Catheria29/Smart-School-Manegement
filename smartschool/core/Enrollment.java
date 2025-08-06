package smartschool.core;
import smartschool.people.*;
import java.time.LocalDate;
import smartschool.core.*;


public class Enrollment {
    public Student student;
    public Course course;
    public String status;
    public double grade;
    public LocalDate enrollmentDate;

    public Enrollment( Student student, Course course, String status, double grade ){
        this.student  = student;
        this.enrollmentDate = LocalDate.now();
        this.grade = grade;
        this.course = course;
        this.status = status;
    }
    public void setStatus(String status ){
        this.status = status;
    }

    public String toString(){
        return student.displayInfo() + "\nGrade: "+ this.grade +"\nCourse: " + this.course + "\nStatus: " + this.status + "\nEnrollment Date: " + this.enrollmentDate ;
    }

}