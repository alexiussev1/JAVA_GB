package Seminar_4;

// программа долна ввести данные пользователя: ФИО, год рождения и пол. Солжит ифнормацию в какие-то струкруры данных.
// после этого надо вывести инофрмацию отсортированную по возрасту

import java.util.*;

public class s4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();

        ArrayList<String> list_f = new ArrayList<>();
        ArrayList<String> list_n = new ArrayList<>();
        ArrayList<String> list_sn = new ArrayList<>();
        ArrayList<String> list_age = new ArrayList<>();
        ArrayList<String> list_sex = new ArrayList<>();

        String[] st = new String[5];
        st = in.split(" ");

        while (!in.equals("q")) {
            list_f.add(st[0]);
            list_n.add(st[1]);
            list_sn.add(st[2]);
            list_age.add(st[3]);
            list_sex.add(st[4]);
            list1.add(in);
            System.out.println(in);
            //list1.add(in);
            in = scanner.nextLine();
            st = in.split(" ");
        }

        System.out.println(list_f);



//        for (String item : list1) {
//            list_last_name.add(item.split(" ")[0]);
//            System.out.println(Arrays.toString(list_last_name));
//        }
//
//        list1.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int o11 = Integer.parseInt(o1.split(" ")[3]);
//                int o22 = Integer.parseInt(o2.split(" ")[3]);
//                return 0;
//            }
//        });

        System.out.println(list1);


//        while (true){
//        String s = scanner.nextLine(); //Иванов Иван Степанович 16М
//        if (s=="+") break;
//        }
//        System.out.println(scanner.toString());


//        while (tr){
//
//        }
//        String in = scanner.nextLine();
//        System.out.println(in);
    }

    private static void sortIndexesByIntList(ArrayList<Integer> arrayToSort, LinkedList<Integer> ind) {
        ArrayList<Integer> arr = new ArrayList<>(arrayToSort);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int tmp = ind.get(j);
                    ind.set(j, ind.get(j + 1));
                    ind.set(j + 1, tmp);

                    tmp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, tmp);
                }
            }
        }
    }
}
