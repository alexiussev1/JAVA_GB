package Homework_2;

//1. Написать метод принимающий строку, ищущий в ней основание и степень После этого
//   расчитывающий результат и выводящий в консоль в консоль строку параметра + ответ.
//   Пример строки: "Основание -12, степень 7, результат". Попробовать с разными входящими строками.
//2. Сравнить скорость работы реплейса классов String и StringBuilder.

public class Homework_2_1 {
    public static void main(String[] args) {
        System.out.println(parse_string("Основание -12, степень 7, результат") );
        System.out.println(parse_string("Основание 1, степень 7, результат") );
        System.out.println(parse_string("Основание 10, степень -2, результат") );
    }

    public static String parse_string(String in_string) {
        String[] strings = in_string.split(" ");
        int number = 0;
        int degree = 0;
        double result = 0;
        for (int i=0; i< strings.length; i++) {
            strings[i]=strings[i].replace(",", "");
            try {
                Integer.parseInt(strings[i]);
                if (number == 0) {
                    number = Integer.parseInt(strings[i]);

                } else {
                    degree = Integer.parseInt(strings[i]);
                }

            } catch (NumberFormatException e) {
                continue;
            }

        }
        result = Math.pow(number, degree);
        return in_string + " " + String.valueOf(result);
    }
}
