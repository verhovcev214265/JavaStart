package sk.com.ymca.java.start.lecture6.classwork.ex9_ForBreak;

public class ForBreak {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            System.out.println("i = " + i + "\n" + i + " iterations have been done");

            if (i == 5) break;
            System.out.println("This string shouldn't be print");
        }
    }
}
