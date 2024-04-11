package sk.com.ymca.java.start.lecture3.homework.task4;

/*
Створіть клас Volume.
Напишіть програму розрахунку об'єму - V та площі поверхні -S циліндра.
Об'єм V циліндра радіусом – R та висотою – h, обчислюється за формулою: V = πR2h
Площа поверхні циліндра обчислюється за формулою:
S = 2πR2 + 2πR2 = 2πR(R+h)
Результати розрахунків виведіть на екран.
 */

public class Volume {

    public static void main(String[] args) {

        double r = 10.0;
        double h = 4.0;

        double v = (Math.PI * Math.pow(r, 2)) * h;
        double s = 2 * Math.PI * r * (r + h);

        System.out.println("V = " + v);
        System.out.println("S = " + s);
    }
}
