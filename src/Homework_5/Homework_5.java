package Homework_5;

//Урок 5. Хранение и обработка данных ч2: множество коллекций Map
//        Создать множество, ключь и значение строки. Добавить шесть элементов. Вывести в консоль значения.
//        Добавить ко всем значениям символ "!".
//        Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключеми первого.
//        Объеденить значания во втором множестве и первом если ключи совподают. Вывести результат в консоль.


import java.util.HashMap;
import java.util.Map;

public class Homework_5 {
    public static void main(String[] args) {

        Map<Integer, String> map_baseData_1 = new HashMap<>();
        map_baseData_1.put(1, "цифра 1");
        map_baseData_1.put(2, "цифра 2");
        map_baseData_1.put(3, "цифра 3");
        map_baseData_1.put(4, "цифра 4");
        map_baseData_1.put(6, "цифра 6");
        map_baseData_1.put(10, "цифра 10");
        System.out.println(map_baseData_1);

        for (int key : map_baseData_1.keySet()) {
            map_baseData_1.compute(key, (k, v) -> v + "!");
        }

        System.out.println(map_baseData_1);


        Map<Integer, String> map_baseData_2 = new HashMap<>();
        map_baseData_2.put(1, "цифра 1");
        map_baseData_2.put(2, "цифра 2");
        map_baseData_2.put(3, "цифра 3");
        map_baseData_2.put(15, "цифра 15");
        map_baseData_2.put(16, "цифра 16");
        map_baseData_2.put(17, "цифра 17");

        System.out.println(map_baseData_2);

        for (int key1 : map_baseData_1.keySet()) {
            for (int key2 : map_baseData_2.keySet()) {
                if (key1 == key2) {
                    map_baseData_1.compute(key1, (k, v) -> v + map_baseData_2.get(key2));
                    map_baseData_2.replace(key2, map_baseData_1.get(key1));
                }
            }
        }

        System.out.println("*".repeat(30));
        System.out.println(map_baseData_1);
        System.out.println(map_baseData_2);
    }
}
