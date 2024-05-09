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

        // unsigned shift to right (use just with types: 'int' or 'long'
        int number = -1 >>> 24;                                         // 1111 1111
        System.out.println("After unsigned shift to right = " + number);
    }
}
