package sk.com.ymca.java.start.inevidualpractica.maks.lists.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Necklace {
    public static void main(String[] args) {

        System.out.println("Enter the length of the necklace:");
        Scanner scan = new Scanner(System.in);
        int necklaceLength = scan.nextInt();

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < necklaceLength; i++) {
            System.out.println("Enter the number:");
            int number = scan.nextInt();

            arrayList.add(number);
        }

        Collections.sort(arrayList);

        for (int j = 0; j < necklaceLength; j++) {
            System.out.print("-" + arrayList.get(j) + "-");
        }
    }
}
