package sk.com.ymca.java.start.lecture9.classwork.ex4;

public class ArrayNull {
    public static void main(String[] args) {

        byte[] arrBytes = new byte[5];
        short[] arrShorts = new short[5];
        int[] arrInts = new int[5];
        long[] arrLongs = new long[5];
        float[] arrFloats = new float[5];
        double[] arrDoubles = new double[5];
        boolean[] arrBooleans = new boolean[5];
        char[] arrCharacters = new char[5];
        String[] arrString = new String[5];

        for(String element : arrString){
            System.out.print(element + ", ");
        }
    }
}
