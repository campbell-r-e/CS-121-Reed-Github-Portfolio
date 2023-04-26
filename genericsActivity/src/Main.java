// Activity 29 #
// Created by Campbell Reed
// The main method created four different arraylists and then
// calls the printArrayList() method to print out the arrays.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericMethods t = new GenericMethods();
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        ArrayList<Double> y = new ArrayList<>();
        y.add(1.1);
        y.add(2.2);
        y.add(3.3);
        y.add(4.4);
        y.add(5.5);
        ArrayList<Character> c = new  ArrayList<>();
        c.add('A');
        c.add('B');
        c.add('C');
        c.add('D');
        c.add('E');
        ArrayList<String> f = new ArrayList<>();
        f.add("Alpha");
        f.add("Beta");
        f.add("Gamma");
        f.add("Delta");
        f.add("Epsilon");

        t.printArrayList(f);
        t.printArrayList(c);
        t.printArrayList(y);
        t.printArrayList(x);


    }
}
