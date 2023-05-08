package Lection_2;

public class api_01_STROKI {
    public static void main(String[] args) {

//        Простой пример
//        Создать строку из 1 млн плюсиков. Как?

        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }



//    concat(): объединение строк
//    valueOf(): преобразует Object в строковое представление (завязан на toString())
//    join(): объединяет набор строк в одну с учетом разделителя
//    charAt(): получение символа по индексу
//    indexOf(): первый индекс вхождения подстроки
//    lastIndexOf(): последний индекс вхождения подстроки
//    startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
//    replace(): замена одной подстроки на другую

//    trim(): удаляет начальные и конечные пробелы
//    substring(): возвращает подстроку, см.аргументы
//    toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
//    сompareTo(): сравнивает две строки
//    equals(): сравнивает строки с учетом регистра
//    equalsIgnoreCase(): сравнивает строки без учета регистра
//    regionMatches(): сравнивает подстроки в строках


    String[] name = { "C", "е", "р", "г", "е", "й" };
    String sk = "СЕРГЕЙ КА.";
    System.out.println(sk.toLowerCase()); // сергей ка.
    System.out.println(String.join("", name)); // Cергей
    System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
    // C,е,р,г,е,й
    System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));


    }
}
