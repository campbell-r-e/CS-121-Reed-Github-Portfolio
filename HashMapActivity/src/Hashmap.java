// Activity 30 #
// Created by Campbell Reed
// This class has a method that dispalys the hashmap when called and
// it has a add method to add keys and values to hashmap
// it also has a remove method to remove a specific key and value
// it also has a getkv method that returns a value for a specific key.


import java.util.HashMap;
import java.util.Map;


public class Hashmap {
   Map<String,String>hash = new HashMap<>();

   public void addkv(String key , String Value){
       hash.put(key,Value);

   }
   public void removekv(String key,String Value){
       hash.remove(key,Value);

   }
   public String getkv(String key ){
       String value = hash.get(key);
       return value;
   }
   public void displaykv(){
       hash.forEach((key, value) -> {
           System.out.printf("Key: %s | Value: %s\n",key,value);

       });


   }


}
