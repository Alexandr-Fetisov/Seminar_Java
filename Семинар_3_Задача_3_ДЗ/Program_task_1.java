// 1. Реализовать алгоритм сортировки слиянием

package Семинар_3_Задача_3_ДЗ;

import java.util.Arrays;
import java.util.Random;

public class Program_task_1 {
    public static void main(String[] args) throws Exception {
        int[] array1 = setRandomArray(10, -10, 99);
        int[] result = mergesort(array1);
        System.out.println("Массив до сортировки:    " + Arrays.toString(array1) + "\nМассив после сортировки: "
                + Arrays.toString(result));
    }

    static int[] setRandomArray(int length, int min, int max) {
        Random random = new Random();
        int[] array = new int[length];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(max - min) + min;
        }
        return array;
    }

    public static int[] mergesort(int[] array) {
        int[] buffer1 = Arrays.copyOf(array, array.length);
        int[] buffer2 = new int[array.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}