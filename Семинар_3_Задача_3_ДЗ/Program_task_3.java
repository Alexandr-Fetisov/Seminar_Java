// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Семинар_3_Задача_3_ДЗ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Program_task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            array.add(rand.nextInt(1, 50));
        }
        System.out.println("Задан целочисленный список: " + (array));
        float sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        float average = sum / array.size();
        System.out.printf("Максимальное число списка = %d \n", Collections.max(array));
        System.out.printf("Минимальное число списка = %d \n", Collections.min(array));
        System.out.printf("Среднее арифметическое списка = %f \n", average);
    }
}
