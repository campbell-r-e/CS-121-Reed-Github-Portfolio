// Activity 35
// Created by Campbell Reed
// This class has several methods to modify an arraylist.


import java.util.ArrayList;


public class StringArrayList {
    public static String name = "Campbell";
    public static String random_letter = "w";
    public static String letters = "z";
    public static ArrayList<String> letter = new ArrayList<>();

    public StringArrayList(){
        this.name ="";
        this.random_letter ="";
        this.letters ="";
    }
    public StringArrayList(String name,String random_letter,String letters){
        this.name = name;
        this.random_letter = random_letter;
        this.letters = letters;
    }
    public static Object adds() {

        letter.add(name);
        letter.add(random_letter);
        letter.add(letters);
        System.out.println("Name and random letter and letters variables were added.");
        return name;

    }
    public static void remove(){
        letter.remove(name);
        letter.remove(random_letter);
        letter.remove(letters);
        System.out.println("All strings have been removed from array.");


    }
    public static void size (){
       int array_size = letter.size();
        System.out.println("Size is:"+array_size);
    }
    public static void find_index(){
        int name_index = letter.indexOf(name);
        int random_letter_index = letter.indexOf(random_letter);
        int letters_index = letter.indexOf(letters);
        System.out.println("Name is at:"+name_index );
        System.out.println("Random letter is at:"+random_letter_index);
        System.out.println("Another letter is at:"+letters_index);

    }
    public static Object display_one (){
        for(Object data : letter){
            System.out.println(data);


        }

        return null;
    }
    public static String display_two(){
        for(int i =0; i<letter.size();i++ ) {
            System.out.println(letter.get(i));

            return String.format(letter.get(i));
        }
        return "fail";
    }


}
