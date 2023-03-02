// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// * 1 - ОЗУ
// * 2 - Объем ЖД
// * 3 - Операционная система
// * 4 - Цвет …

// 4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// 5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package Семинар_6_Задача_6_ДЗ;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program_task_1 {
    static List<Laptop> shop; // список с ноутбуками

    public static void main(String[] args) {

        // каталог на базе класса Laptop
        shop = new LinkedList<Laptop>();

        // каталог
        shop.add(new Laptop(1, 2, 128, "Ubuntu", "black"));
        shop.add(new Laptop(2, 4, 256, "Ubuntu", "white"));
        shop.add(new Laptop(3, 6, 256, "Windows 10", "blue"));
        shop.add(new Laptop(4, 8, 512, "macOS", "silver"));
        shop.add(new Laptop(5, 12, 512, "Windows 11", "black"));
        shop.add(new Laptop(6, 16, 1024, "Windows 11", "white"));
        shop.add(new Laptop(7, 32, 2048, "Windows 11", "black"));

        // если искомый вариант ноутбука не найден
        final String no_laptops = "\nК сожалению, мы не смогли подобрать для вас ноутбук по данному параметру :(\n";

        // задаем сканер
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        int choice;

        // выводим меню
        while (true) {
            System.out.println("Добро пожаловать!");
            System.out.println("Выбарите критерий для поиска ноутбуков:");
            System.out.println("1 - поиск по объему оперативной памяти");
            System.out.println("2 - поиск по объему встроенного накопителя");
            System.out.println("3 - поиск по используемой операционной системе");
            System.out.println("4 - поиск по цвету");
            System.out.println("5 - выход");

            // выбранный пункт меню
            choice = sc.nextInt();
            System.out.println();
            int n = 0; // больше ноля если что-то нашли
            StringBuilder founded = new StringBuilder(); // найденные ноутбуки
            if(choice == 1){
                System.out.println("Какой минимальный ОЗУ (в Гб) необходим?");
                int ram = sc.nextInt();
                for (Laptop laptop : shop) {
                    if (laptop.ram >= ram) {
                        founded.append(laptop.toString()).append("\n");
                        n++;
                    }
                }
            }
            else if(choice == 2){
                System.out.println("Какой минимальный объем накопителя (в Гб) необходим?");
                int hdd = sc.nextInt();
                for (Laptop laptop : shop) {
                    if (laptop.hdd >= hdd) {
                        founded.append(laptop.toString()).append("\n");
                        n++;
                    }
                }
            }
            else if(choice == 3){
                System.out.println("Какую операционную систему предпочитаете?");
                String os = sc2.nextLine();
                for (Laptop laptop : shop) {
                    if (os.equals(laptop.os)) {
                        founded.append(laptop.toString()).append("\n");
                        n++;
                    }
                }
            }
            else if(choice == 4){
                System.out.println("Какой цвет необходим?");
                String color = sc3.nextLine();
                for (Laptop laptop : shop) {
                    if (color.equals(laptop.color)) {
                        founded.append(laptop.toString()).append("\n");
                        n++;
                    }
                }
            }
            else if(choice == 5){
                break; // выход из меню
            }
            if(n==0) {
                System.out.println(no_laptops); // ничего не найдено
            } else {
                System.out.println("\nНайдены следующие варианты:\n\n" + founded); // вывод найденных ноутбуков
            }
        }
        sc.close();
        sc2.close();
        sc3.close();
    }

}

// класс ноутбука + характеристики ноутбука
class Laptop {
    int id;
    int ram;
    int hdd;
    String os;
    String color;

    // конструктор класса
    public Laptop(int id, int ram, int ssd, String os, String color){
        this.id = id;
        this.ram = ram;
        this.hdd = ssd;
        this.os = os;
        this.color = color;
    }

    // вывод всех полей в одну строку
    public String toString() {
        return String.format("id: %d, RAM: %d ГБ, SSD: %d ГБ, OS: %s, COLOR: %s", id, ram, hdd, os, color);
    }
    
}
