// Activity 37
// Created by Campbell Reed
// This class creates an object called student
// This class has various getters and setters for the Student object.
//

public class Student {
String name;
String id;
String major;

    public Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
    }


    public void Student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;


}
public String getname(){
    return name;
}
    public void setname(String name){
        this.name = name;
    }
    public void setid(String id){
      this.id = id;
    }
    public String getId(){
      return id;
    }
    public void setmajor(String major){
      this.major = major;

    }
    public String getMajor(){
      return major;
    }


}
