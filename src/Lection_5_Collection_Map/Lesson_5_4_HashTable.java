package Lection_5_Collection_Map;

//        «Устаревший брат» коллекции HashMap, который не знает про null

import java.util.Hashtable;
import java.util.Map;

public class Lesson_5_4_HashTable {
    public static void main(String[] args) {

    Map<Integer, String> table = new Hashtable<>();
        table.put(1, "один"); System.out.println(table);
        //{1=один}
        table.put(6, "шесть"); System.out.println(table);
        //{1=один, 6=шесть}
        table.put(4, "четыре"); System.out.println(table);
        //{1=один, 6=шесть, 4=четыре}
        table.put(3, "три"); System.out.println(table);
        //{1=один, 6=шесть, 4=четыре, 3=три}

        //table.put(null,"!null"); System.out.println(table); java.lang.NullPointerException

    }
}
