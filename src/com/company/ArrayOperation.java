package com.company;

import java.io.*;
import java.util.*;

public class ArrayOperation {
    public static ArrayList fillTheArray(ArrayList array) {
        array.add("authoritative");
        array.add("authoritative");
        array.add("target");
        array.add("product");
        array.add("register");
        array.add("register");
        array.add("routine");
        array.add("disk");
        array.add("disk");
        array.add("disk");
        return array;
    }
    public static ArrayList fillTheArrayFromFile(ArrayList array) throws IOException {
        return array;
    }
    public static void printUniqueWords (ArrayList<String> array) {
        Set<String> tempArray = new TreeSet<>();
        for (String arr : array) {
            String a = arr.toLowerCase();
            tempArray.add(a);
        }
        for (String tempArr : tempArray) {
            int count = 0;
            for (String arr : array) {
                String a = arr.toLowerCase();
                if(tempArr.equals(a)) count++;
            }
            System.out.println("\"" + tempArr + "\"" + " repeated in the list = " + count);
        }
        System.out.println();
    }
}