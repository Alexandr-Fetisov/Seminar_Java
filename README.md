## "Знакомство с языком программирования Java"
### Семинар 1:

*Задача_1_ДЗ:*

1. Вычислить [n-ое треугольного число](https://ru.wikipedia.org/wiki/Треугольное_число "Необязательная подсказка") (сумма чисел от 1 до n), n! /(произведение чисел от 1 до n)
2. Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка)
3. Реализовать простой калькулятор
4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

____
### Семинар 2:

*Задача_2_ДЗ:*

1. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

* Как работает сортировка пузырьком?

*Сортировка пузырьком заключается в следующем: начиная с начала массива просматриваем попарно по 2 элемента (первый со вторым, второй с третим, третий с четвертым и т.д.). Если второй элемент в паре меньше первого элемента – перемещаем его на место первого, а первый на место второго, делаем это для всех элементов. После того, как мы дошли до конца массива (сравнили предпоследний и последний элементы и сделали обмен, если обмен необходим), проверяем, был ли хотя бы один обмен. Если да, значит массив не отсортирован и начинаем все сначала. Повторяем такие проходы, пока не будет так, что мы проверили попарно все элементы от начала до конца, а обмена ни одного не было. 
Таким образом элементы с самыми маленькими значениями в результате обменов перемещаются справа налево. То есть они как будто всплывают, как мыльный пузырь. Отсюда и название метода – пузырьком.*

2. К калькулятору из предыдущего дз добавить логирование.
____
### Семинар 3:

*Задача_3_ДЗ:*

1. Реализовать алгоритм сортировки слиянием

2. Пусть дан произвольный список целых чисел, удалить из него четные числа

3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.








