package Homework_4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Homework_4_1 {
    public static void main(String[] args) throws FileNotFoundException {


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
                ***
                """;
// запись в файл
        System.out.println(my_phone_book_1); //- проверка
        try (FileWriter fw = new FileWriter("homework_4_1_phone_book.txt", false)) {
            fw.write(my_phone_book_1);
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String my_phone_book_2 = "";
        FileReader fr = new FileReader("homework_4_1_phone_book.txt");
        Scanner scan = new Scanner(fr);

        ArrayList<String[]> list_My = new ArrayList<String[]>();

        String in = scan.nextLine();
        int id = 0;

        while (!in.equals("***")) {
//            System.out.println(in);
            String[] st = new String[6];

            st[0] = in.split(" ")[0];
            st[1] = in.split(" ")[1];
            st[2] = in.split(" ")[2];
            st[3] = in.split(" ")[3];
            st[4] = in.split(" ")[4];
            st[5] = Integer.toString(id);
            id++;
            list_My.add(st);
            in = scan.nextLine();
        }


        for (int i = 0; i < list_My.size(); i++) {
            for (int j = 0; j < list_My.size() - 1; j++) {
                if (Integer.parseInt(list_My.get(j)[3]) > Integer.parseInt(list_My.get(j + 1)[3])) {
                    String[] temp = list_My.get(j);
                    list_My.set(j, list_My.get(j + 1));
                    ;
                    list_My.set(j + 1, temp);
                }

            }
        }


        System.out.println("");
        System.out.println("*".repeat(25));
        System.out.println("");


        for (String[] item : list_My) {
            System.out.println(item[0] + " " + item[1].charAt(0) + "." + item[2].charAt(0)+". "
                    + item[3] +" " +item[4]);
        }


    }
}