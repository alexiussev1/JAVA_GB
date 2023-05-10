package Homework_3;

//Урок 3. Коллекции JAVA: Введение

//        4.Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.


import java.util.ArrayList;
import java.util.Random;

public class Homework_3_4 {
    public static void main(String[] args) {

        //*** 4 *****************************************************************************************************
        System.out.println();
        System.out.println("*** 4.Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом ***");

        ArrayList<Integer> my_list_4_1 = new ArrayList<>();
        ArrayList<Integer> my_list_4_2 = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            my_list_4_1.add(new Random().nextInt(33));
        }
        for (int i = 0; i < 10; i++) {
            my_list_4_2.add(new Random().nextInt(33));
        }

        System.out.println("Исходные списки: ");
        System.out.println(my_list_4_1);
        System.out.println(my_list_4_2);

        ArrayList<Integer> my_list_4_temp = new ArrayList<>(); // создаем темповский список
        my_list_4_temp = (ArrayList<Integer>) my_list_4_2.clone();
        my_list_4_temp.removeAll(my_list_4_1); //убираме в темповском списке все значения из первого списка
        my_list_4_1.addAll(my_list_4_temp);

        System.out.println("Объединенный список: ");
        System.out.println(my_list_4_1);


    }
}
