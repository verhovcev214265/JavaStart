package sk.com.ymca.java.essential.Lecture4.practice.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Ludmila");
        teachers.add("Zinaida");
        teachers.add("Pandora");

        System.out.println("The best teacher is: " + teachers.indexOf("Ludmila") + "\n" +
                "The worst teacher is: " + teachers.indexOf("Pandora") + "\n" +
                "The all teachers: " + teachers);

    }
}
