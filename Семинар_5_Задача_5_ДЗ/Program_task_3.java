// 3. Реализовать алгоритм пирамидальной сортировки (HeapSort).

package Семинар_5_Задача_5_ДЗ;

import java.util.Random;
import java.util.Arrays;

public class Program_task_3 {
    public static void main(String[] args) {
        int[] arrToSort = setRandomArray(10, 1, 99);
        System.out.println ("Задан массив:         " + Arrays.toString(arrToSort));
        // сортируем
        sortArray(arrToSort);
        System.out.println("Результат сортировки: " + Arrays.toString(arrToSort));
    }

    static int[] setRandomArray(int size, int start, int end) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.ints(start, (end + 1)).findFirst().getAsInt();
        }
        return arr;
    }

    // пирамидальная сортировка
    static void sortArray(int arr[]) {
        int N = arr.length;
        for (int i = N / 2 - 1; i >= 0; i--) heapify(arr, N, i);
        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    static void heapify(int arr[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < N && arr[l] > arr[largest]) largest = l;
        if (r < N && arr[r] > arr[largest]) largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, N, largest);
        }
    }

    // вывод массива в консоль
    static void printArray(int arr[]) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

}
