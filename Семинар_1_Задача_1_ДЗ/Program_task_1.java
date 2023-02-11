// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package Семинар_1_Задача_1_ДЗ;

import java.util.Scanner;

public class Program_task_1 {
    public static void main(String[] args) {
        System.out.println("Задача 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)");
        try (Scanner task = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            int n = task.nextInt();
            System.out.println("Сумма: " + getSum(n));
            System.out.println("Произведение: " + getFact(n));
        }
    }

    private static int getSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    private static int getFact(int n) {
        int fact = 1;
        for (int j = 1; j <= n; j++) {
                fact *= j;
            }
        return fact;
        }
}