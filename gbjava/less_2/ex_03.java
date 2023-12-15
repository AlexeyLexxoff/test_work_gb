package less_2;

// Задание №3
// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).

public class ex_03 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("А роза упала на лапу Азора"));
    }

    public static boolean isPalindrome(String s) {

        s = s.replace(" ", "");

        StringBuilder sb = new StringBuilder(s);

        String reversed = sb.reverse().toString();

        return s.equalsIgnoreCase(reversed);

    }
}