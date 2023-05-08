package Seminar_2;

public class Seminar_2_1_StringBuilder {
    public static void main(String[] args) {

        String a="Hello";
        long begin = System.currentTimeMillis();

        for (int i=0;i<1000;i++){
            a += Character.getName(i);
        }

        long  end = System.currentTimeMillis();
        System.out.println(end - begin + " мс");
        // System.nanoTime(); - время наносеекунд от работы запуска виртуальной машины

        StringBuilder builder = new StringBuilder("World!");

        begin = System.currentTimeMillis();
        for (int i=0; i<30000; i++) {
            builder.append(Character.getName(i));
        }
        a += builder.toString();
        end = System.currentTimeMillis();
        System.out.println(end - begin + " мс");

        builder.delete(0, builder.length()/2);
        builder.insert(2, .43f);
        builder.deleteCharAt(3);
        builder.reverse();
        builder.indexOf("Hel"); // вернет индекс совпадения первого
        builder.lastIndexOf("Hel"); //вернет индек символа который последний в строке
        builder.replace(1, 5, "235");//заменяет в диапазоне
        builder.charAt(0); //возвращает символ в конкретном индексе

        System.out.println(builder.toString());
    }

}

