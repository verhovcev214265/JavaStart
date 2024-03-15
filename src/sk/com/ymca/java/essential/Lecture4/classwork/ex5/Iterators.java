package sk.com.ymca.java.essential.Lecture4.classwork.ex5;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);

        // За допомогою інтерфейсу ітератор можемо пробігатись по нашому списку
        Iterator<Integer> iterator = arrayList.iterator();

        // дізнаємось чи є наступний елемент у нашому списку за допомоги метода hasNext()
        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.print(integer + " ");
        }
        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        // Оптимізований ітератор я кий має більше методів (можливостей)
        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()){
            Integer integer = listIterator.next() + 10;
            System.out.print(integer + ", ");
        }

        System.out.println(ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER);

        while (listIterator.hasPrevious()){
            Integer integer = listIterator.previous();
            System.out.print(integer + ", ");
        }
    }
}
