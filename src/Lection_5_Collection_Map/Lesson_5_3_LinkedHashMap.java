package Lection_5_Collection_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lesson_5_3_LinkedHashMap {
    public static void main(String[] args) {

//        LinkedHashMap
//        «Старший брат» коллекции HashMap, который все помнит…
//        Помнит порядок добавления элементов ➜ более медлительный

        Map<Integer, String> linkmap = new LinkedHashMap<>();

        linkmap.put(1, "один"); System.out.println(linkmap);
        //{1=один}
        linkmap.put(6, "шесть"); System.out.println(linkmap);
        //{1=один, 6=шесть}
        linkmap.put(4, "четыре"); System.out.println(linkmap);
        //{1=один, 6=шесть, 4=четыре}
        linkmap.put(3, "три"); System.out.println(linkmap);
        //{1=один, 6=шесть, 4=четыре, 3=три}
        linkmap.put(2,"два"); System.out.println(linkmap);
        //{1=один, 6=шесть, 4=четыре, 3=три, 2=два}




    }
}
