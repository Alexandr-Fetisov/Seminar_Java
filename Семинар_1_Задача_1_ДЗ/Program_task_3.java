// 3. Реализовать простой калькулятор

package Семинар_1_Задача_1_ДЗ;

import java.util.Scanner;

public class Program_task_3 {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Реализовать простой калькулятор ");
            System.out.print("Ввведите первое число: ");
            float oneNumber = in.nextFloat();
            System.out.print("Ввведите второе число: ");
            float twoNumber = in.nextFloat();
            System.out.print("Укажите арифметическую операцию (+, -, /, *): ");
            String op = in.next();
            System.out.printf("Ответ: %f", calc(oneNumber, twoNumber, op));

        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public static float calc(float n1, float n2, String op) {
        float result = 0;
        switch (op) {
            case "+":
                result = n1 + n2;
                break;

            case "-":
                result = n1 - n2;
                break;

            case "/":
                result = n1 / n2;
                break;

            case "*":
                result = n1 * n2;
                break;

            default:
                break;

        }

        return result;

    }
}