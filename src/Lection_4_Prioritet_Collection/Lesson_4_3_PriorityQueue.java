package Lection_4_Prioritet_Collection;

import java.util.PriorityQueue;

public class Lesson_4_3_PriorityQueue {
    public static void main(String[] args) {

//        PriorityQueue
//        Наивысший приоритет имеет «наименьший» элемент.
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
