package sk.com.ymca.java.start.lecture6.classwork.ex12_ForInFor;

public class ForInFor {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (i > j) {
                    System.out.print("*");
                } else break;

            }
            System.out.println();
        }
    }

}
