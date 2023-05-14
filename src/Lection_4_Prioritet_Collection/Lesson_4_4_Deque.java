package Lection_4_Prioritet_Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lesson_4_4_Deque {
    public static void main(String[] args) {
//        Deque –  double ended queue
//        Линейная коллекция, которая поддерживает вставку и удаление
//        элементов на обоих концах. | url
//        https://docs.oracle.com/javase/7/docs/api/java/util/Deque.html
        Deque<Integer> deque =new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeLast(); deque.removeFirst();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst(); deque.pollLast();
        deque.getFirst(); deque.getLast();
        deque.peekFirst(); deque.peekLast();

    }
}
