package Lection_6;

//        HashSet
//
//        isEmpty() – проверка на пустоту.
//        add(V) – добавление элемента в коллекцию.
//        remove(V) – удаление элемента из коллекции.
//        contains(V) – проверка на включение элемента в коллекции.
//        clear() – удаление всех элементов коллекции.
//        size() – возвращает количество элементов коллекции.

import java.util.HashSet;
import java.util.Set;

public class Lesson_6_1_1_HashSet {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();
        set.add(1); set.add(12); set.add(123);
        set.add(1234); set.add(1234);
        System.out.println(set.contains(12)); //true
        set.add(null);
        System.out.println(set.size()); //5 null - вошел в коллекцию
        System.out.println(set);
        set.remove(12);
        System.out.println(set);
        for(var item:set) System.out.println(item);// null 1 1234 123
        System.out.println(set);

        set.clear();
        System.out.println(set);


    }
}
