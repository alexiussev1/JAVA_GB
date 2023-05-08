package Lection_3_Collection;

//  Тип данных Object – «всему голова»
//  Упаковка – любой тип можно положить в переменную типа Object
//  Распаковка – преобразование Object-переменной в нужный тип
//  Иерархия типов – любой тип «ниже» Object’а

//    ЖИВОТНЫЕ
//       V
//  МЛЕКОПИТАЮЩИЕ
//       V
//     ПРИМАТЫ
//       V
//  ЧЕЛОВЕК РАЗУМНЫЙ

public class lesson_3_1_object {
    public static void main(String[] args) {

        //1
        Object o = 1;
        GetType(o);               //java.lang.Integer
        o = 1.2;
        GetType(o);                    //java.lang.Double


        //2
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));


    }

    //1
    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());

    }

    //2
    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else return 0;
    }

}
