package less_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Задание №1
// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на
// позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

public class ex_01 {
    public static void main(String[] args) {
        boolean flag = true;
        String str;
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        while (flag) {
            System.out.println(">>> ");
            str = scanner.nextLine();

            String[] strArr = str.split("~");

            int num = Integer.parseInt(strArr[1]);
            if (strArr[0].equals("print")) {
                System.out.println(list.remove(num));

            } else if (strArr[0].equals("end")) {
                flag = false;
            } else {
                list.add(num, strArr[0]);
            }

        }
        System.out.println(list);

    }

}
