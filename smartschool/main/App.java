package smartschool.main;
import smartschool.people.*;

import java.util.ArrayList;
//import smartschool.core.*;

public class App{
    public static ArrayList<String> courses(ArrayList<String> c){
        return c;
    }
    public static void main(String[] args){
        Person one = new Person(2366368,"Jacque Willy","shgy@gmail.com");
        ArrayList<String> course = new ArrayList<String>();
       course.add("Math");
        course.add("Bio");
        course.add("Eps");
//        course.add("Physics");
//        course.add("CS");
//        Student studentOne = new Student(2366368,"Jacque Willy","shgy@gmail.com",'B',course);
//        System.out.println(one.displayInfo());
//        System.out.println("\nChild class.");
//        System.out.println(studentOne.displayInfo());
//        studentOne.enrollCourse("music");
//        System.out.println(studentOne.displayInfo());
//        System.out.println(studentOne);
        System.out.println(courses(course));

    }
}