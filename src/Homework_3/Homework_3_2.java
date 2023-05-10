package Homework_3;

//Урок 3. Коллекции JAVA: Введение
//        2.Пусть дан произвольный список целых чисел, удалить из него чётные числа



import java.util.ArrayList;
import java.util.Random;

public class Homework_3_2 {
    public static void main(String[] args) {

        //*** 2 *****************************************************************************************************

        ArrayList<Integer> my_list_2 = new ArrayList<>();
        System.out.println();
        System.out.println("*** 2.Пусть дан произвольный список целых чисел, удалить из него чётные числа ***");
        for (int i = 0; i < 15; i++) {
            my_list_2.add(new Random().nextInt(33));

        }

        System.out.println("Исходный список: ");
        System.out.println(my_list_2);

        for (int i = 0; i < my_list_2.size(); i++) {
            if (my_list_2.get(i) % 2 == 0) {
                my_list_2.remove(i);
                i = -1;
            }

        }

        System.out.println("Откорректированный список: ");
        System.out.println(my_list_2);



    }
}
