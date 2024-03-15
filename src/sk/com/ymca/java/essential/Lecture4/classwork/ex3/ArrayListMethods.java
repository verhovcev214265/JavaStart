package sk.com.ymca.java.essential.Lecture4.classwork.ex3;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("student");
        arrayList.add("how are you?");

        System.out.println(arrayList + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Можемо додавати елементи зв індексом
        arrayList.add(0, " - Teacher says ");
        System.out.println(arrayList + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Видаляємо елемент по індексу
        arrayList.remove(2);
        System.out.println(arrayList + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Видаляємо елемент по значенню
        arrayList.remove("hello");
        System.out.println(arrayList + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Видаляємо елемент по індексу
        numbers.remove(1);
        System.out.println(numbers + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Видаляємо елемент по значенню
//        Integer num = 2;
        numbers.remove((Integer) 2);
        System.out.println(numbers + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

    }
}
