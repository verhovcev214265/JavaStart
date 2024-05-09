package sk.com.ymca.java.start.lecture4.classwork.ex8_Ternary;

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

public class Ternary {

    public static void main(String[] args) {

        int x = -10, y = -5, q = 9;
        String quadrant0, quadrant1, quadrant2;

        // Не рекомендовано вкладати  тернарні оператори так як це погіршує читабельність коду.

        quadrant0 = x > 0 ? (y > 0 ? "I quadrant" : "IV quadrant") :
                (y > 0 ? "II quadrant" : "III quadrant");

        if (x > 0){
            if (y > 0){
                quadrant0 = "q1";
            }else {
                quadrant0 = "q4";
            }
        }else {
            if (y > 0){
                quadrant0 = "q2";
            }else {
                quadrant0 = "q3";
            }
        }

        quadrant1 =
                (x > 0) ? ((y > 0) ? "I quadrant" : "IV quadrant")
                        : ((y < 0) ? "II quadrant" : "III quadrant");

        quadrant2 = x > 0 ? y > 0 ? "I quadrant" : "IV quadrant" : y > 0 ? "II quadrant" : "III quadrant";

        System.out.println(quadrant0 + "\n" + quadrant1 + "\n" + quadrant2)
        ;



    }
}
