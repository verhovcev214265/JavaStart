package sk.com.ymca.java.start.lecture8.classwork.ex6;

public class DifficultRecursion {

//    Складна рекурсія - виклик метода самого себе через інший метод

    static void recursion(int counter){
        counter--;

        System.out.println("The first part of the recursion: " + counter);

        if (counter != 0){
            method(counter);
        }

        System.out.println("The second part of the recursion: " + counter);

    }

    static void method(int counter){
        System.out.println("The first part of the method: " + counter);

        recursion(counter);

        System.out.println("The second part of the method: " + counter);
    }

    public static void main(String[] args) {
        method(3);
    }

}
