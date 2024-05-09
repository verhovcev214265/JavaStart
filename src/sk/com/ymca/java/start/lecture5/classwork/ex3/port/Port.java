package sk.com.ymca.java.start.lecture5.classwork.ex3.port;

public class Port {
    public static void main(String[] args) {

        /*
        В нас є порт введення/виведення або рєїстр з визначеним значенням у ньому.
        Нам необхідно ввімкнути пристрій який керується 1-им бітом, встановивши при цьому
        1-ий біт в 1.
        Після цього нам терба вимкнути пристрій, скинувши його 1-ий біт в 0.
         */

        // 0111 0000 - початкове значення порта введення/виведення
        byte port = 0b111_0000;
        // 0000 0010 - маска вмикання пристрою яке керується 1-им бітом.
        byte mask = 0b00_0010;

        System.out.println("port = " + port + " is off.");

        port = (byte) (port | mask); /*  Turn on the device controlled by the first bit
                                                (0111 0000 | 0000 0010 = 0111 0010)
                                     */
        System.out.println("port = " + port + " is on.");

        //How can we put the values in another way
        mask = 0b1111101;            //Create mask for put off our instrument

        port = (byte) (port & mask); /* Turn off the device controlled by the first bit
                                                (0111 0010 & 0111 1101 = 0111 0000)
                                     */
        System.out.println("port = " + port + " is off.");
    }
}
