package Homework_3;

//Урок 3. Коллекции JAVA: Введение
//        1.Реализовать алгоритм обратной сортировки списков компаратором.
//        2.Пусть дан произвольный список целых чисел, удалить из него чётные числа
//        3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
//        4.Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
//        5.Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
//        6.Повторить пятый пункт но с LinkedList.
//        7.Сравнить время работы пятого и шестого пунктов.


import java.util.*;

public class Homework_3_567 {
    public static void main(String[] args) {


        //*** 5 *****************************************************************************************************
        System.out.println();
        System.out.println("*** 5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз ***");

        System.out.println("Начался цикл заполнения списка... ");
        long start = System.nanoTime();

        ArrayList<Integer> my_list_5 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            my_list_5.add(0, 0);
        }
        long finish = System.nanoTime();
        long delta_time_5 = finish - start;
        System.out.println("Закончился цикл заполнения списка размером " + my_list_5.size() + " за " + delta_time_5 + " наносекунд");
        my_list_5.clear(); //очистил что бы не влияло на скорость подсчета у 6 задачи :-/


        //*** 6 *****************************************************************************************************
        System.out.println();
        System.out.println("*** 6. Создать LinkedList и добавить нулевым эллементом ноль 10000 раз ***");

        System.out.println("Начался цикл заполнения списка... ");
        start = System.nanoTime();

        LinkedList<Integer> my_list_6 = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            my_list_6.addFirst(0);
        }
        finish = System.nanoTime();
        long delta_time_6 = finish - start;
        System.out.println("Закончился цикл заполнения списка размером " + my_list_6.size() + " за " + delta_time_6 + " наносекунд");
        System.out.println("*".repeat(60));

        //*** 7 *****************************************************************************************************
        System.out.println();
        System.out.printf("Заполнение списка класса  LinkedList было бысрее чем в ArrayList в " + "%.2f", (double) delta_time_5 / delta_time_6);
        System.out.print(" раз");
        System.out.println();

    }
}
