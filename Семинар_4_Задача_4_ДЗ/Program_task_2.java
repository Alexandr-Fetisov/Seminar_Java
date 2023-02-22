// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// - enqueue() - помещает элемент в конец очереди
// - dequeue() - возвращает первый элемент из очереди и удаляет его
// - first() - возвращает первый элемент из очереди, не удаляя.

package Семинар_4_Задача_4_ДЗ;

import java.util.LinkedList;

public class Program_task_2 {
    public static void main(String[] args) {

        int[] list = { 4, 5, 7, 2, 3, 8 };

        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }

        System.out.println("Задан список: " + (linkList));

        enqueue(linkList, 9);
        System.out.println("Помещает элемент в конец очереди: " + (linkList));

        System.out
                .println("Возвращает первый элемент из очереди " + dequeue(linkList) + " и удаляет его " + (linkList));
        // System.out.println("и удаляем его: " + (linkList));
        System.out.println("Возвращает первый элемент из очереди " + first(linkList) + " не удаляя " + (linkList));
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}