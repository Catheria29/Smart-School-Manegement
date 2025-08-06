package smartschool.people;
public class Person{
    int id;
    String name;
    String email;
    public Person(int id,String name, String email){
        this.name = name;
        this.id = id;
        this.email = email;
    }



    public String displayInfo(){
        return "Id: " + this.id + "\nName: " + this.name + "\nEmail: " + this.email;
    }
}