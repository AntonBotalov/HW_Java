package HW_1;

import java.util.Scanner;

/**
 * 2) 3) Реализовать простой калькулятор (+-/*)
 */
public class file3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        System.out.print("Введите действие:\n1 - '+'\n2 - '-'\n3 - '*'\n4 -  '/'\n  ");
        int sym = sc.nextInt();
        String s = "";
        int res = 0;
        switch (sym) {
            case 1:
                res = a + b;
                s = "+";
                break;
            
             case 2:
                res = a - b;
                s = "-";
                break;

            case 3:
                res = a * b;
                s = "*";
                break;

            case 4:
                res = a / b;
                s = "/";
                break;
            
            default:
                res = 0;
                break;
        }
        System.out.printf("%d %s %d = %d", a, s, b, res );
        sc.close();
    }
}
