package Homework_4;

//          Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
//        1.Сохранить в файл строку и загрузить из файла строку с выводом в консоль используя классы FileWriter и FileReader
//        2.Загрузить из файла многострочный текст формата ФИО возраст и пол через пробелы. Разбить по строкам и вывести в
//          консоль в формате "Иванов И.И. 32 М"
//        3.Загруженный и разбитый по строкам текст загрузить в подготовленные списки. Фамилии, имена, отчества, возрас и пол
//          в отдельных списках.
//        4.Отсортировать по возрасту используя дополнительный список индексов.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Homework_4_1 {

    public static void main(String[] args) throws Exception {
        String my_phone_book_1 = """
                Иванов Иван Степанович 99 М
                Иванов Иван Степанович 16 М
                Иванов Иван Степанович 16 М
                Иванов Иван Степанович 16 М
                Иванов Иван Степанович 25 Ж
                Иванов Иван Степанович 20 Ж
                Иванов Иван Степанович 115 Ж
                Соловьев Алексей Иванович 37 М
                Сорокина Елена Петровна 45 Ж
                q
                """;
// запись в файл
        System.out.println(my_phone_book_1); //- проверка
        try (FileWriter fw = new FileWriter("homework_4_phone_book.txt", false)) {
            fw.write(my_phone_book_1);
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        String my_phone_book_2 = "";
        FileReader fr = new FileReader("homework_4_phone_book.txt");
        Scanner scan = new Scanner(fr);


        ArrayList<String> list_1 = new ArrayList<>();
        ArrayList<String> list_f = new ArrayList<>();
        ArrayList<String> list_n = new ArrayList<>();
        ArrayList<String> list_sn = new ArrayList<>();
        ArrayList<Integer> list_age = new ArrayList<>();
        ArrayList<String> list_sex = new ArrayList<>();
        ArrayList<Integer> list_id = new ArrayList<>();

        String in = scan.nextLine();
        int id = 0;

        while (!in.equals("q")) {
            System.out.println(in);
            String[] st = new String[5];
            st = in.split(" ");
            list_1.add(in);
            list_f.add(st[0]);
            list_n.add(st[1]);
            list_sn.add(st[2]);
            list_age.add(Integer.parseInt(st[3]));
            list_sex.add(st[4]);
            list_id.add(id);
            in = scan.nextLine();
            id++;
        }

        System.out.println(list_f);
        System.out.println(list_n);
        System.out.println(list_sn);
        System.out.println(list_age);
        System.out.println(list_sex);
        System.out.println(list_id);


        //Сортировака по возоасту
        int temp_1 = 0;
        int temp_2 = 0;
        boolean flag = true;
        while (flag){
            for (int i = 0; i < list_age.size() - 1; i++) {
                flag = false;
                if (list_age.get(i) >= list_age.get(i + 1)) {
                    temp_1 = list_age.get(i);
                    list_age.set(i, list_age.get(i+1));
                    list_age.set(i+1, temp_1);

                    temp_2 = list_id.get(i);
                    list_id.set(i, list_id.get(i+1));
                    list_id.set(i+1, temp_2);
                    flag = true;
                }
            }
        }


        System.out.println(list_f);
        System.out.println(list_n);
        System.out.println(list_sn);
        System.out.println(list_age);
        System.out.println(list_sex);
        System.out.println(list_id);

        for (int i: list_id){
            System.out.println(list_1.get(i));
        }

//
//
////        for (int i : list_id) {
////            System.out.println(list_1.get(i));
////        }
//
//
//        String[] temp = new String[6];
//        List<String[]> list_phone = new ArrayList<String[]>();
//
//        while (scan.hasNextLine()) {
////            my_phone_book_2 = my_phone_book_2 + "\n" + scan.nextLine();
//            temp[0] = scan.nextLine().split(" ")[0];
//            temp[1] = scan.nextLine().split(" ")[1];
//            temp[2] = scan.nextLine().split(" ")[2];
//            temp[3] = scan.nextLine().split(" ")[3];
//            temp[4] = scan.nextLine().split(" ")[4];
//            temp[5] = Integer.toString(id);
//            id++;
//            System.out.println(Arrays.toString(temp));
//
////            list_phone.add(temp[]);
//        }
//        fr.close();
//
//        System.out.println(my_phone_book_2); // - проверка
//
//
////            temp = scan.nextLine().split(" ");

//            list_f.add(scan.nextLine().split(" ")[0]);
//            list_n.add(scan.nextLine().split(" ")[1]);
//            list_sn.add(scan.nextLine().split(" ")[2]);
////            list_age.add(scan.nextLine().split(" ")[3]);
////            list_sex.add(scan.nextLine().split(" ")[4]);
//            list_id.add(id++);
//        int id = 0;
//        String[] temp;


    }
}