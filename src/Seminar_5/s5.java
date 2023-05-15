package Seminar_5;

import java.util.*;

public class s5 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("Один", "One");
        map.put("Пять", "Five");
        map.put("Два", "Two");
        map.put("Трий", "Three");

        String str = map.get("Ноль");
        System.out.println(str);

        map.remove("Пять");//вернет Five и удалит
        map.remove("Пять", "Five");//вернет истину и удалит

        map.keySet(); // возвращает все ключи
        for (String key: map.keySet()){
            System.out.println(map.get(key));

        }
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(map.get(key));
        }
        Set keys = map.keySet();
        for (int i=0;i<keys.size();i++){
            System.out.println(map.get(keys.toArray()[i]));
        }
        map.replace("Five", "5"); //если ключ пять существовал, значение будет заменено на 5.
        // если не существовал, то вренут null

        map.replace("Five", "", "5");// если нашел, вернет истину и заменит ячейку, если не нашел то вернет ложь

        map.getOrDefault("Шесть", "0"); //пытается взять ключ, если не найдено то возвращает 0
        map.containsKey("Шесть"); //cуществует ли такой ключ - истина - ложь
        map.containsValue("Five"); //существует ли такое значение - истина - ложь.

        map.putIfAbsent("Шесть", "6");// запишет значение, если ключа нет, если есть, то не будет записывать.
        map.forEach((k,v) -> System.out.println(k+" "+v));

        map.compute("Шесть", (k, v) -> v+"!?"); // выбрать элемент и изменить его значение (красиво и компактно)
        System.out.println(map);
        map.computeIfPresent("Шесть", (k,v) -> v+"!?"); // если ключ есть то делает, если нет то ичего не делает
        map.computeIfAbsent("Шесть", v -> v+"!?"); //если ключа нет, то сработает

        for (String key: map.keySet()){
            map.compute(key, (k,v) -> v+"!"); //лямбда -

        }
        System.out.println(map);

        map.merge("Один", "7", String::concat); // пвыбирает пару ключ занчение,и к тому значению прибавляем сонкадом 7 - слияние
        System.out.println(map);


        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>(); //сохраняет очередность ввода

        hashMap.put("Один", "One");
        hashMap.put("Пять", "Five");
        hashMap.put("Два", "Two");
        hashMap.put("Трий", "Three");
        hashMap.putIfAbsent("Шесть", "6");

        System.out.println(hashMap);

        TreeMap<String, String> treeMap = new TreeMap<>();


        treeMap.put("Один", "One");
        treeMap.put("Пять", "Five");
        treeMap.put("Два", "Two");
        treeMap.put("Трий", "Three");
        treeMap.putIfAbsent("Шесть", "6");

        System.out.println(treeMap);

        TreeMap<Integer , String> treeMap2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        treeMap2.put(1, "One");
        treeMap2.put(5, "Five");
        treeMap2.put(2, "Two");
        treeMap2.put(3, "Three");
        treeMap2.putIfAbsent(6, "6");

        System.out.println(treeMap2.headMap(2, true));  // вывод с головы
        System.out.println(treeMap2.tailMap(2, false)); // вывод хвоста

    }
}