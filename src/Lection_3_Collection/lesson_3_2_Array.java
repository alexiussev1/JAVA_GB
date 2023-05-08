package Lection_3_Collection;

// Проблема. Как увеличить размер массива?
// Есть массив из 2 элементов
public class lesson_3_2_Array {
    public static void main(String[] args) {

        //1 способ

        System.out.println("1 способ");
        int[] a = new int[]{1, 9};
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);
        for (int i : a) {
            System.out.printf("%d", i); // 1 9
        }
        for (int j : b) {
            System.out.printf("%d", j); // 0 9 0 0 0 0 0 0 0 0
        }
        System.out.println("");

        //2 способ

        System.out.println("2 способ");
        int[] a1 = new int[]{0, 9};
        for (int i : a) {
            System.out.printf("%d", i);
        }
        a1 = AddItem(a, 2);
        a1 = AddItem(a, 3);
        for (int j:a) {
            System.out.printf("%d",j);

        }


    }

    //2 способ
    static int[] AddItem(int[] array, int item) {
        int lenght = array.length;
        int[] temp = new int[lenght + 1];
        System.arraycopy(array, 0, temp, 0, lenght);
        temp[lenght] = item;
        return temp;
    }
    //Но JAVA для упрощения операции создал для этого КОЛЛЕКЦИИ ...см след файл...
}
