package sk.com.ymca.java.start.lecture4.classwork.ex4_Ternary;

public class Ternary {

    /*
       Тернарна умовна операція
       Тернарний оператор [? :] являється скороченим записом конструкції if...else.
       [? :] - містить в собі 3-и операнда - ( Умова ? Якщо умова true : Якщо умова false )

       Алгоритм роботи тернарної операції (Логічний вираз) ? вираз_1 : вираз_2
        1) Вираховується логічний вираз (умова)
        2) Якщо логічний вираз (умова) true, тоді вираховується вираз_1, якщо ні вираз_2
        3) Вирахуванне значення повертається
     */

    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int max = 0;

        // За допомоги тернароного оператора визначаємо найбільше значення в 2-ох змінних і пресвоюємо результат і змінну max

//        if (a > b){
//            max = a;
//        }else {
//            max = b;
//        }
//        System.out.println("Max value = " + max);

        max = (a <= b) ? a : b;
        System.out.println("Max value = " + max);

    }
}