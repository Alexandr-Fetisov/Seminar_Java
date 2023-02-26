// 2. Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

package Семинар_5_Задача_5_ДЗ;

import java.util.*;

public class Program_task_2 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();

        // задаем имена и фамилии
        List<String> employees = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов");
        // переносим их в массив строк
        String[] employeesList = employees.toArray(new String[0]);
        // считаем популярность каждого имени
        for (int i = 0; i < employeesList.length; i++) {
            // разделим имя и фамилию
            String[] employee = employeesList[i].split(" ");
            // считаем популярность имени
            if (nameMap.containsKey(employee[0])) {
                nameMap.replace(employee[0], nameMap.get(employee[0]) + 1);
            } else {
                nameMap.put(employee[0], 1);
            }
        }
        // выводим повторяющиеся имена с количеством повторений
        System.out.println("Количество повторений имен:");
        nameMap.entrySet().forEach(entry -> {
            System.out.printf("встречается - %d раз(а) имя: %s\n", entry.getValue(), entry.getKey());
        });
        // сортируем
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();

        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }

        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        // выводим отсортированные по убыванию популярности
        System.out.println("По убыванию популярности:");
        sortedNameMap.entrySet().forEach(entry -> {
            System.out.printf("%d раз(а) имя: %s\n", entry.getValue(), entry.getKey());
        });
    }

}
