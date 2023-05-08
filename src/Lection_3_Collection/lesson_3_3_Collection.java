package Lection_3_Collection;

import java.util.ArrayList;

public class lesson_3_3_Collection {
    public static void main(String[] args) {
        //Коллекция Array list

//        List – пронумерованный набор элементов.
//                Пользователь этого интерфейса имеет точный контроль над тем,
//                где в списке вставляется каждый элемент.
//                Пользователь может обращаться к элементам по их целочисленному
//        индексу (позиции в списке) и искать элементы в списке.

//        https://docs.oracle.com/javase/8/docs/api/java/util/List.html

//        ArrayList, LinkedList (Vector, Stack – устаревшие)


        ArrayList list = new ArrayList();  // в коллекцию вставляется любой тип
        list.add(2809);

        for (Object o: list){
            System.out.println(o);
        }
        ArrayList<Integer> list1 = new ArrayList<Integer>(); // в коллекцию вставляется только интеджер
        list1.add(2809);

        for (Object o: list1){
            System.out.println(o);
        }

        // Разные способы создание колекции
        ArrayList<Integer> list10 = new ArrayList<Integer>();
        ArrayList<Integer> list11 = new ArrayList<>();
        ArrayList<Integer> list12 = new ArrayList<>(10); // хранилище под 10 элементов
        ArrayList<Integer> list14 = new ArrayList<>(list12); // на основе одной коллекции можно создать другую

    }


}
