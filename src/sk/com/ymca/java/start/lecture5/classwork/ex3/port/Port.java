package sk.com.ymca.java.start.lecture5.classwork.ex3.port;

public class Port {
    public static void main(String[] args) {

        byte port = 0b111_0000;  // 112 - Dec
        byte mask = 0b00_0010;  // 2 - Dec

        System.out.println("port = " + port + " is off.");

        port = (byte) (port | mask); /*  Turn on the device controlled by the first bit
                                                (0111 0000 | 0000 0010 = 0111 0010)
                                     */
        System.out.println("port = " + port + " is on.");

        mask = 0b111_1101;            //Create mask for put off our instrument

        port = (byte) (port & mask); /* Turn off the device controlled by the first bit
                                                (0111 0010 & 0111 1101 = 0111 0000)
                                     */
        System.out.println("port = " + port + " is off.");
    }
}
