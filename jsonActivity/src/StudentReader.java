// Activity 37
// Created by Campbell Reed
// By using the main method this class
// reads the student dat from the
// Json file and prints it to the user.

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class StudentReader {
    public static void main(String[] args) {
        try{
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("student.json"));
            Student student = gson.fromJson(reader,Student.class);
            System.out.println("****Student Details****");
            System.out.printf("Student name: %s\nStudent id: %s\nStudent Major: %s",student.getname(),student.getId(),student.getMajor());

        }catch (IOException e){
            e.printStackTrace();

        }
    }

}
