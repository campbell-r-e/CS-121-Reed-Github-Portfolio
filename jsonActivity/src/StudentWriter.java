// Activity 37
// Created by Campbell Reed
// This class writes student data to the json file using the main method.
//

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {
    public static void main(String[] args) {
        try{
            Student student = new Student("Campwbells","5555555678","premed");
            Gson gson = new Gson();
            String jsonString = gson.toJson(student);
            FileWriter fileWriter = new FileWriter("Student.json");
            fileWriter.write(jsonString);
            fileWriter.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
