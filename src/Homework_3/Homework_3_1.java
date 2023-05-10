package Homework_3;

//Урок 3. Коллекции JAVA: Введение
//        1.Реализовать алгоритм обратной сортировки списков компаратором.

import java.util.ArrayList;
import java.util.Comparator;

public class Homework_3_1 {
    public static void main(String[] args) {

        //*** 1 *****************************************************************************************************
        System.out.println();
        System.out.println("*** 1.Реализовать алгоритм обратной сортировки списков компаратором ***");

        ArrayList<String> my_list_1 = new ArrayList<>();
        my_list_1.add("Приветик");
        my_list_1.add("Пока");
        my_list_1.add("Пикачу");
        my_list_1.add("Пабл");
        my_list_1.add("Пябл");

        System.out.println("Исходный список: ");
        System.out.println(my_list_1);

        my_list_1.sort(Comparator.reverseOrder());

        System.out.println("Откорректированный список: ");
        System.out.println(my_list_1);
        System.out.println();

    }
}
