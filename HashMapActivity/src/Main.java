// Activity 30 #
// Created by Campbell Reed
// The main method here creates a hashmap and asks the user for a key and value
// and then the method calls the add key methods to store the parameters,
// and then it calls a method to display the full hashamp.
// This maehtod then removes a key key and then prints the updated hashmap
// It then returns a value for key3.
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        Hashmap r = new Hashmap();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a String key");
        String key = keyboard.nextLine();
        System.out.println("Enter Value for the key");
        String value = keyboard.nextLine();
        r.addkv(key,value);
        System.out.println("Enter another String key");
        String key1 = keyboard.nextLine();
        System.out.println("Enter another Value for the key");
        String value1 = keyboard.nextLine();
        r.addkv(key1,value1);
        System.out.println("Enter and another String key");
        String key2 = keyboard.nextLine();
        System.out.println("Enter and even another Value for the key");
        String value2 = keyboard.nextLine();
        r.addkv(key2,value2);
        System.out.println("Enter last String key");
        String key3 = keyboard.nextLine();
        System.out.println("Enter last Value for the key");
        String value3 = keyboard.nextLine();
        r.addkv(key3,value3);
        r.displaykv();
        System.out.println(r.getkv(key1));
        r.removekv(key3,value3);
        System.out.println("");
        r.displaykv();

    }

}
