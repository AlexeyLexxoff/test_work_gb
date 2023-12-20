package less_4;
// Задание №2

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//  Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная
// была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

public class ex_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        boolean work = true;
        while (work) {
            String line = scanner.nextLine();
            switch (line) {
                case "print":

                    for (int i = list.size() - 1; i >= 0; i--) {
                        System.out.println(list.get(i));

                    }
                    break;
                case "revert":
                    list.remove(list.size() - 1);
                    break;
                case "finish":
                    work = false;
                    break;

                default:
                    list.add(line);
            }

        }

    }

}
