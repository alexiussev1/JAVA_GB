package Lection_4_Prioritet_Collection;

import java.util.Arrays;
import java.util.Stack;

import static java.lang.Character.isDigit;

public class Lesson_4_5_Stack {
//    Stack
//
// Работает по принципу, те данные ,. что пришли ранее будут обработанны в последнюю очередь

//    Stack представляет собой обработку данных по принципу LIFO.
//    Расширяет Vector пятью операциями, которые позволяют рассматривать
//    вектор как стек.
//    push(E item)
//    pop()
//    Вычислить значение выражения в постфиксной форме записи
//    1+2*3       (1+2)*3
//    123*+       12+3*

    //1 2 3 * +             СТЕК
    public static void main(String[] args) {
        var exp = "1 2 3 * +".split(" "); //1 + 2 * 3
        int res = 0;
        System.out.println(Arrays.toString(exp));

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(Integer.parseInt(exp[i]))) {   //Проверяем является текущий элемент числом
                st.push(Integer.parseInt(exp[i]));      //Если да то добавляем в стек преобразовав из строки в число
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                case "-":
                    res = -st.pop() + st.pop();
                    st.push(res);
                    break;
                case "*":
                    res = st.pop() * st.pop();
                    st.push(res);
                    break;
                }
            }

        }
    }


}
