package Homework_6;

//Урок 6. Хранение и обработка данных ч3: множество коллекций Set
//        Разработать программу, имитирующую поведение коллекции HashSet. В программе создать метод add
//        добавляющий элемент, метод toString возвращающий строку с элементами множества и метод позволяющий читать элементы по индексу.
//        *Реализовать все методы из семинара.
//        Формат данных Integer.

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Random;

public class Homework_6 {
    public static void main(String[] args) {

        mySet list = new mySet();
        for (int i=0; i<10; i++){
            list.add(new Random().nextInt(100));
        }

        System.out.println(Arrays.toString(list.toStr()));
        System.out.println(list.getItem(3));
    }
}

class mySet{
    static  final Object OBJECT = new Object();
    private LinkedHashMap<Integer,Object> hashMap = new LinkedHashMap<>();

    public boolean add(int num){
        return hashMap.put(num, OBJECT) == null;
    }
    public Object[] toStr(){
        return hashMap.keySet().toArray();
    }


    public Integer getItem (int index){
        return (Integer) toStr()[index];
    }

}