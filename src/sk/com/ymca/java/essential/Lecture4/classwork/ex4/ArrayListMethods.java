package sk.com.ymca.java.essential.Lecture4.classwork.ex4;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Name");
        arrayList.add("Name");
        arrayList.add("Surname");
        arrayList.add("Surname");
        arrayList.add("Surname");
        arrayList.add("Surname");

        // Задаємо вмістимість списку
        arrayList.ensureCapacity(30);

        // Дивимось розмір списку
        System.out.println(arrayList.size() + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Дістаємо елемент зі списку
        System.out.println(arrayList.get(0) + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);


//        IndexOutOfBoundException
//        System.out.println(arrayList.get(2));


        // Дістаємо індекс вказаного об'єкту
        System.out.println(arrayList.indexOf("Surname") + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Дістаємо індекс об'єкта з кінця списку
        System.out.println(arrayList.lastIndexOf("Surname") + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

    }
}
