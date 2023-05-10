package Homework_3;

//Урок 3. Коллекции JAVA: Введение
//        3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Collections;

public class Homework_3_3 {
    public static void main(String[] args) {

        //*** 3 *****************************************************************************************************
        System.out.println();
        System.out.println("*** 3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка ***");
        int[] array_3 = {15, 20, 0, -100, 50, 50, 55, 3, 999};
        ArrayList<Integer> my_list_3 = new ArrayList<>();

        int sum_number = 0;
        for (int item : array_3) {
            sum_number = sum_number + item;
            my_list_3.add(item);
        }
        double sr_number = (double) sum_number / my_list_3.size();

        System.out.println("Исходный список" + my_list_3);
        System.out.println("Минимальное значение: " + Collections.min(my_list_3));
        System.out.println("Минимальное значение: " + Collections.max(my_list_3));
        System.out.printf("Среднее значение: " + "%.2f", sr_number);
        System.out.println();

    }
}
