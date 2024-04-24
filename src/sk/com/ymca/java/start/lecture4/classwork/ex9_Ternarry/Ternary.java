package sk.com.ymca.java.start.lecture4.classwork.ex9_Ternarry;

public class Ternary {

    public static void main(String[] args) {
        double quantity = 9;     // Кількість товару
        double price = 100;       // Ціна
        double discount = 0.75;   // Знижка
        double total;              // Загальна вартість

        total = (quantity >= 10) ? quantity * price * discount : quantity * price;

        System.out.println("Your total = " + total + " $");
    }
}
