// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

package Семинар_5_Задача_5_ДЗ;

import java.util.HashMap;
import java.util.List;

public class Program_task_1 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        // заполняем телефонную книгу
        addToPhoneBook("Круглов", "+7(916)555-44-13", "+7(901)654-11-22");
        addToPhoneBook("Петров", "+7(917)444-55-14", "+7(902)987-12-77");
        addToPhoneBook("Сидоров", "+7(918)333-66-15", "+7(903)321-45-16");
        // выводим в консоль абонента с определенной фамилией
        findInPhoneBook("Круглов");
    }

    // в тел. книге телефоны указываем в виде списка строк
    public static void addToPhoneBook(String name, String phone1, String phone2) {
        phoneBook.put(name, List.of(phone1, phone2));
    }

    // поиск телефона по фамилии и вывод в консоль
    public static void findInPhoneBook(String name) {
        System.out.println("Абонент '" + name + "' телефоны: " + phoneBook.get(name));
    }
}

