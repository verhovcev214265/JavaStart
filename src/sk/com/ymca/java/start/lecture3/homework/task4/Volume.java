package sk.com.ymca.java.start.lecture3.homework.task4;

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
