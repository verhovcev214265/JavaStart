package sk.com.ymca.java.start.lecture5.classwork.ex6.logicShift;

public class LogicShift {
    public static void main(String[] args) {

        byte operand = 0b0000001;                                       // 0000 0001
        System.out.println("Before shift = " + operand);

        // to left
        operand = (byte) (operand << 2);                                // 0000 0100
        System.out.println("After shift to left = " + operand);

        // to right
        operand = (byte) (operand >> 1);                                // 0000 0010
        System.out.println("After shift to right = " + operand);

        int number = -1 >>> 24;
        System.out.println(number);
    }
}
