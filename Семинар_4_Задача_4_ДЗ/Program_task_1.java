// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Семинар_4_Задача_4_ДЗ;

import java.util.Random;
import java.util.LinkedList;

public class Program_task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = linkedListRandom(10, 10, 99);
        System.out.println("Заданный список:     " + (linkedList));

        System.out.println("Перевернутый список: " + reversalLinkedListRandom(linkedList));
    }

    // создание + рандомное заполнение LinkedList
    static LinkedList<Integer> linkedListRandom(int size, int start, int end) {
        Random random = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            int num = random.nextInt(start, end);
            linkedList.add(num);

        }
        return linkedList;
    }

    // перевернуть LinkedList
    static LinkedList<Integer> reversalLinkedListRandom(LinkedList<Integer> linkedList) {
        LinkedList<Integer> linkedListResult = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedListResult.addFirst(linkedList.get(i));
        }
        return linkedListResult;
    }
}
