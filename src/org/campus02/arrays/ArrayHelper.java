package org.campus02.arrays;

import java.util.Arrays;

public class ArrayHelper {
    public static void main(String[] args) {
        int[] arr = {8,5,1,9,0,4};

       ArrayHelper.arrangeOder(arr);

    }

    public static void arrangeOder(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
