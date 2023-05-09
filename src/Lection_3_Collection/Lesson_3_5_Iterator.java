package Lection_3_Collection;

import java.util.Iterator;
import java.util.List;

public class Lesson_3_5_Iterator {
    public static void main(String[] args) {

//        Итератор
//        Получение итератора с целью более гибкой работы с данными URL
//        https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
//        Интерфейс Iterator<E>. Итератор коллекцией. Iterator занимает место
//        Enumeration в Java Collections Framework. Итераторы отличаются от
//        перечислений двумя способами:
//        Итераторы позволяют вызывающей стороне удалять элементы из
//        базовой коллекции во время итерации с четко определенной
//        семантикой.

//        hasNext(), next(), remove()

//        ListIterator<E> URL https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html

//        hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)

        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) { // Пока есть следующий элемент
            System.out.println(col.next());
//            col.next();
//            col.remove();
        }

    }
}
