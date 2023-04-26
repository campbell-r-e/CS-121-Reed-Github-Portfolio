// Activity 35
// Created by Campbell Reed
// This class has methods to test two of the String array list class
// methods.

import org.junit.Test;

import static org.junit.Assert.*;

public class StringArrayListTest {
    StringArrayList r = new StringArrayList("Campbell","s","w");
    StringArrayList p = new StringArrayList();

    //StringArrayList q = new StringArrayList("a","x","z");
    @Test
    public void adds() {
       //assertEquals("Campbell",r.adds());
       assertEquals("a","b");
    }

    @Test
    public void display_one() {
        p.display_one();
        assertEquals("fail",p.display_one());
        //q.display_one();

    }

}