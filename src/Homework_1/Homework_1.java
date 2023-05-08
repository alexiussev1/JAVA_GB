//Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main
//        *Пункты реализовать в разных методах
//
//        int i = new Random().nextInt(k); //это кидалка случайных чисел!)

import java.util.Random;

public class Homework_1 {
    public static void main(String[] args) {

        //Выброс случайного целого числа в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(0, 2001);
        System.out.println(i);

        //Посчитать и сохранить в n номер старшего значащего бита выпавшего числа - не понял что значит старший бит
        //  в какой системе разряда
        System.out.println("Случайное число: " + i);
        String str = Integer.toBinaryString(i);
        System.out.println("Переводим число в двоичную систему: " + str);
        int n = str.length()-1;
        System.out.println("Старшийн номер бита: " + n);

        String tmp = "";
        String str1 = new String();

        for (int j=n; j<=Short.MAX_VALUE;j=j+n){
            tmp = Integer.toString(j);
            str1 = str1 + tmp + ';';

        }
        System.out.println("Проверка чисел до Short.MAXN_VALUE: " + str1);

        // сохранил информацию по числам кратности в массив m1
        String m1 [] = str1.split(";");

        str1 ="";

        for (int j=n; j>=Short.MIN_VALUE;j=j-n){
            tmp = Integer.toString(j);
            str1 = tmp + ';' + str1;
        }

        System.out.println("Проверка чисел до Short.MIN_VALUE: " + str1);

        // сохранил информацию по числам кратности в массив m2
        String m2 [] = str1.split(";");

//
    }
}