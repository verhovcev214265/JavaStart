package sk.com.ymca.java.start.lecture9.homework.task2;

/*
1) Создать метод myReverse(int [] array), который принимает в качестве аргумента массив
целочисленных элементов и возвращает инвертированный массив (элементы массива в обратном
порядке).
2) Создайте метод int [] subArray(int [] array, int index, int count). Метод возвращает
часть полученного в качестве аргумента массива, начиная с позиции указанной в аргументе index,
размерностью, которая соответствует значению аргумента count.
Если аргумент length содержит значение больше чем количество элементов, которые входят в
выбираемую часть исходного массива (от указанного индекса index, до индекса последнего элемента),
то при формировании нового массива размерностью в count, заполните единицами те элементы,
которые не были скопированы из исходного массива.
 */

import sk.com.ymca.java.start.lecture1.classwork.ITaskConstants;

import java.util.Arrays;

public class ArrayUtils {

    public static int[] myReverse(int[] inputArr){

        int[] outputArr = new int[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            outputArr[i] = inputArr[ (inputArr.length - 1) - i ];
        }

        return outputArr;
    }

    public static int[] subArray(int[] array, int index, int length){
        int[] outputArray = new int[length];

        for (int i = 0; i < outputArray.length; i++) {
            if (index + i < array.length){
                outputArray[i] = array[index + i];
            }else {
                outputArray[i] = 1;
            }
        }
        return outputArray;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(
                "Before reverse: " + Arrays.toString(numbers)
                + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
        );

        int[] reversed = ArrayUtils.myReverse(numbers);
        System.out.println(
                "After reverse: " + Arrays.toString(reversed)
                + ITaskConstants.NEW_LINE + ITaskConstants.DELIMITER
        );


        int[] subArray = ArrayUtils.subArray(numbers, 1, 10);
        System.out.println(Arrays.toString(subArray));

    }
}
