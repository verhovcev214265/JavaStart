package sk.com.ymca.java.start.lecture5.homeassignment.task3;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;
import java.util.Scanner;

public class Premium {
    public static final String EXIT_MESSAGE = "\n" + "If you want to go out enter (-1)";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double bonus;

        while (true) {
            System.out.println("Enter your salary: " + EXIT_MESSAGE);
            double salary = scan.nextDouble();

            if (salary == -1.0) {
                System.out.println("Bye - bye");
                break;
            } else {
                System.out.println("Enter year of experience: ");
                int yearOfExperience = scan.nextInt();

                if (yearOfExperience >= 0 && yearOfExperience <= 4) {
                    bonus = (salary * 1.10) - salary;
                    System.out.println("Your bonus to 10% of your salary = " + bonus + "$\n" +
                            "Your salary = " + salary + "$\nYou will get " + (salary + bonus));
                } else if (yearOfExperience >= 5 && yearOfExperience <= 9) {
                    bonus = (salary * 1.15) - salary;
                    System.out.println("Your bonus to 15% of your salary = " + bonus + "$\n" +
                            "Your salary = " + salary + "$\nYou will get " + (salary + bonus));
                } else if (yearOfExperience >= 10 && yearOfExperience <= 14) {
                    bonus = (salary * 1.25) - salary;
                    System.out.println("Your bonus to 25% of your salary = " + bonus + "$\n" +
                            "Your salary = " + salary + "$\nYou will get " + (salary + bonus));
                } else if (yearOfExperience >= 15 && yearOfExperience <= 19) {
                    bonus = (salary * 1.35) - salary;
                    System.out.println("Your bonus to 35% of your salary = " + bonus + "$\n" +
                            "Your salary = " + salary + "$\nYou will get " + (salary + bonus));
                } else if (yearOfExperience >= 20 && yearOfExperience <= 24) {
                    bonus = (salary * 1.45) - salary;
                    System.out.println("Your bonus to 45% of your salary = " + bonus + "$\n" +
                            "Your salary = " + salary + "$\nYou will get " + (salary + bonus));
                } else if (yearOfExperience >= 25) {
                    bonus = (salary * 1.50) - salary;
                    System.out.println("Your bonus to 50% of your salary = " + bonus + "$\n" +
                            "Your salary = " + salary + "$\nYou will get " + (salary + bonus));
                } else {
                    System.out.println(ITaskConstants.IColors.RED + "You entered incorrect symbol " +
                            ITaskConstants.IColors.RESET);
                }
            }
        }

        scan.close();
    }
}
