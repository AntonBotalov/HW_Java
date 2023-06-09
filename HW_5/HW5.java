package HW_5;

import java.util.Scanner;
/*
 * Реализуйте структуру телефонной книги с помощью HashMap.
 * Программа также должна учитывать, что во входной структуре будут
 * повторяющиеся имена с разными телефонами, их необходимо считать, как одного
 * человека с разными телефонами. Вывод должен быть отсортирован по убыванию
 * числа телефонов.
 * Пример ввода:
 * Иванов 234234
 * Иванов 32523
 * Иванов 5687
 * Иванов: 234234, 32523, 5687
 * 
 * Варианты Map:
 * Map<String, ArrayList>
 * Map<String, String>
 * 
 * Пример меню:
 * 1. Добавить контакт
 * 2. Вывести всех
 * 3. Выход
 */

public class HW5 {
    public static void main(String[] args) {
        boolean isActive = true;

        while (isActive) {
            System.out.println();
            System.out.print(
                    "Введите:\n'1' для добавления контакта\n'2' для вывода списка контактов\n'0'для выхода введите: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.println();
                    System.out.print("Введите имя контакта: ");
                    String name = sc.nextLine();
                    System.out.print("Введите номер контакта: ");
                    Integer number = sc.nextInt();
                    sc.nextLine();
                    func.addContact(name, number);
                    break;

                case 2:
                    System.out.println();
                    func.getContacts();
                    break;

                case 0:
                    System.out.println();
                    isActive = false;
                    break;

                default:
                    System.out.println();
                    System.out.println("Задача не распознана, повторите!");
                    break;
            }
        }
    }
}
