//1. Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).
package Java;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String s = iScanner.nextLine();
        iScanner.close();
        if (isPalindrome(s)) {
            System.out.println("Строка паллиндром");
        } else {
            System.out.println("Строка не паллиндром");
        }

    }

    public static boolean isPalindrome(String s) {
        for(int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
