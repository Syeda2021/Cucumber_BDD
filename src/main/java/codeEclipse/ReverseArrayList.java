package codeEclipse;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        // how to reverse arraylist in java

        ArrayList<String> listOfInt = new ArrayList<>();
        listOfInt.add("1");
        listOfInt.add("2");
        listOfInt.add("3");
        listOfInt.add("4");
        listOfInt.add("5");
        System.out.println("before reverse list" + listOfInt);
        Collections.reverse(listOfInt);
        System.out.println("after reverse list" + listOfInt);

    }
}
