package HW_1;

import java.util.Scanner;

/**
 * Задание
 * 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
 * (произведение чисел от 1 до n)
 * 2) Вывести все простые числа от 1 до 1000
 * 3) Реализовать простой калькулятор (+-/*)
 * 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
 * Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы
 * одно решение или сообщить, что его нет.
 * Под знаком вопроса - всегда одинаковая ЦИФРА.
 * Введите уравнение: ?? + ?? = 44
 * Решение: 22 + 22 = 44
 */
public class file1 {
    public static void main(String[] args) {
        // Задание 1:
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = sc.nextInt();
        int fac = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
            fac *=i;
        }
        System.out.printf("Треугольного число = %d \nn! = %d", sum, fac);
    }
    
}