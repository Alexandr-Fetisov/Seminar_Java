// 4.*+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

package Семинар_1_Задача_1_ДЗ;

import java.util.Scanner;

public class Program_task_4 {
    public static void main(String[] args) {
        try (Scanner task = new Scanner(System.in)) {
            System.out.println("Введите выражение вида q + w = e, неизвестные цифры заменить на знак '?', например 2? + ?5 = 69:");
            String[] arr = task.nextLine().split(" ");
            System.out.println("Вариант решения:\n" + recoverExp(arr));
        }
    }
    static String recoverExp(String[] arr){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int q = Integer.parseInt(arr[0].replace("?", Integer.toString(i)));
                int w = Integer.parseInt(arr[2].replace("?", Integer.toString(j)));
                int e = Integer.parseInt(arr[4]);
                if((q + w) == e) return q + " + " + w + " = " + e;
            }
        }
        return "Решения нет";
    }
}