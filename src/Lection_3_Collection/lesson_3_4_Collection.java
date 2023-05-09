package Lection_3_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;


public class lesson_3_4_Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(123);
        // list.add("string line");
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных
        }


        //ФУНЦИОНАЛ
        //    add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
        //    get(pos) – возвращает элемент из списка по указанной позиции
        //    indexOf(item) – первое вхождение или -1
        //    lastIndexOf(item) – последнее вхождение или -1
        //    remove(pos) – удаление элемента на указанной позиции и его возвращение
        //    set(int pos, T item) – помещает значение item элементу, который находится
        //    на позиции pos
        //    void sort(Comparator) – сортирует набор данных по правилу
        //    subList(int start, int end) – получение набора данных от позиции start до end


        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = new StringBuilder[]{day, month, year};
        List<StringBuilder> d = Arrays.asList(date);

        System.out.println(d); //[29, 9, 1990]
        date[1] = new StringBuilder("09");
        System.out.println(d); //[29, 09, 1990]

        //      clear() – очистка списка
        //      toString() – «конвертация» списка в строку
        //      Arrays.asList – преобразует массив в список
        //      containsAll(col) – проверяет включение всех элементов из col
        //      removeAll(col) – удаляет элементы, имеющиеся в col
        //      retainAll(col) – оставляет элементы, имеющиеся в col
        //      toArray() – конвертация списка в массив Object’ов
        //      toArray(type array) – конвертация списка в массив type
        //      List.copyOf(col) – возвращает копию списка на основе имеющегося
        //      List.of(item1, item2,...) – возвращает неизменяемый список

        Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y'); //удалять через remove элмеенты просто так не получится
        System.out.println(list1);

        value = null;
        List<Character> list2 = new ArrayList<Character>();
        list2.add('S');
        list2.add('e');
        list2.add('r');
        System.out.println(list2);
        list2.remove(1); //java.lang.UnsupportedOperationException
        System.out.println(list2);
        List<Character> list3 = List.copyOf(list2);


    }
}



