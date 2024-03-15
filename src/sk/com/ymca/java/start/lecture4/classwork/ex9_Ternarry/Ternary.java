package sk.com.ymca.java.start.lecture4.classwork.ex9_Ternarry;

public class Ternary {

    public static void main(String[] args) {
        double quantity = 10;     // Кількість товару
        double price = 100;       // Ціна
        double discount = 0.75;   // Знижка
        double cost;              // Загальна вартість

        cost = (quantity >= 10) ? quantity * price * discount : quantity * price;

        System.out.println("Your cost = " + cost + " $");
    }
}
