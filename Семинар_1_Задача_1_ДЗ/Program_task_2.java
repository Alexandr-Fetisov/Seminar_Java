// 2. Вывести все простые числа от 1 до 1000

package Семинар_1_Задача_1_ДЗ;

public class Program_task_2 {
    
    public static void main(String[] args) {
        System.out.println("Задача 2. Вывести все простые числа от 1 до 1000");
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / j; j++)
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            if (isPrime)
                System.out.print(i + ", ");
        }
    }
}