package HW_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook NoteBook1 = new NoteBook
// NoteBook NoteBook2 = new NoteBook
// NoteBook NoteBook3 = new NoteBook
// NoteBook NoteBook4 = new NoteBook
// NoteBook NoteBook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

public class HW6 {
    public static void main(String[] args) {

        NoteBook NoteBook1 = new NoteBook(0, "Apple", "MacBook Pro", "Apple M2", "Apple M2 7-core", 16, 512);
        NoteBook NoteBook2 = new NoteBook(1, "Apple", "MacBook Air", "Apple M1", "Apple M1 7-core", 8, 256);
        NoteBook NoteBook3 = new NoteBook(2, "ASUS", "TUF Gaming", "AMD Ryzen 9", "GeForce RTX 3060 Ti", 8, 512);
        NoteBook NoteBook4 = new NoteBook(3, "Aser", "Aspire", "Intel Core i5", "GeForce RTX 3070 Ti", 16, 1024);
        NoteBook NoteBook5 = new NoteBook(4, "Acer", "Vivobook", "Intel Core i5", "Intel UHD Graphics", 8, 512);

        Map<Integer, NoteBook> NoteBookMap = new HashMap<>();
        NoteBookMap.put(NoteBook1.getId(), NoteBook1);
        NoteBookMap.put(NoteBook2.getId(), NoteBook2);
        NoteBookMap.put(NoteBook3.getId(), NoteBook3);
        NoteBookMap.put(NoteBook4.getId(), NoteBook4);
        NoteBookMap.put(NoteBook5.getId(), NoteBook5);

        boolean isActive = true;

        while (isActive) {
            System.out.print( "Введите 1 для вывода всех ноутбуков\nВведите 2 для поиска с фильтром\nДля выхода введите 0: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.println();
                    Server.showAll(NoteBookMap);
                    break;

                case 2:
                    System.out.println();
                    Server.filter(NoteBookMap);
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