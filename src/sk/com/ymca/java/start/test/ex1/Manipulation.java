package sk.com.ymca.java.start.test.ex1;

public class Manipulation {

    public String[] showName(int numbers, String name){

        String[] output = new String[numbers];

        for (int i = 0; i < numbers; i++) {
            output[i] = name;
        }

        return output;
    }

    public void sayHello(){
        System.out.println("Hello =) ");
    }
}
