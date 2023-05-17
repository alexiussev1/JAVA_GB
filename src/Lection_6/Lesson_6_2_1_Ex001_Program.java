package Lection_6;

import java.util.Arrays;
import java.util.HashSet;

public class Lesson_6_2_1_Ex001_Program {
    public static void main(String[] args) {
        Lesson_6_2_1_Worker w1 = new Lesson_6_2_1_Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Lesson_6_2_1_Worker w4 = new Lesson_6_2_1_Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        Lesson_6_2_1_Worker w2 = new Lesson_6_2_1_Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Lesson_6_2_1_Worker w3 = new Lesson_6_2_1_Worker();
        w2.firstName = "Имя_3";
        w2.lastName = "Фамилия_3";
        w2.salary = 300;
        w2.id = 3000;

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);

        System.out.println(w1==w2);
        System.out.println(w1.equals(w4));
        var worker = new HashSet<Lesson_6_2_1_Worker>(Arrays.asList(w1,w2,w3));
        System.out.println(worker.contains(w4));
    }

}
