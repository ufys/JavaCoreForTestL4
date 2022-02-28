package com.company;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //задание 1
        ArrayList<String> wordArray = new ArrayList<>();
        System.out.println("Number of words in the list:\n");
        wordArray = ArrayOperation.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        wordArray.clear(); // отчистка
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        // Задание 2
        Phonebook phonebook = new Phonebook();

        phonebook.add(2304578, "Hall");
        phonebook.add(5678794, "Hall");
        phonebook.add(3656783, "Robinson");
        phonebook.add(3456278, "White");
        phonebook.add(5464563, "White");
        phonebook.add(6475693, "White");

        System.out.println("Phonebook:\n");
        phonebook.get("Hall");
        phonebook.get("Robinson");
        phonebook.get("White");
    }
}
