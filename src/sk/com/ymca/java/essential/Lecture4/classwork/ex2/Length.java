package sk.com.ymca.java.essential.Lecture4.classwork.ex2;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

import java.util.ArrayList;

public class Length {
    public static void main(String[] args) {

        String[] strings1 = new String[]{"String1"};

        strings1 = new String[] {"String1", "String2"};

        for (String tmp : strings1) {
            System.out.println(tmp);
        }

        System.out.println(ITaskConstants.DELIMITER);

        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("String2");
        strings2.add("String2");


        for (String tmp : strings2){
            System.out.println(tmp);
        }

    }
}
