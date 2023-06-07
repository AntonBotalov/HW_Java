package HW_1;

/**
 * 2) Вывести все простые числа от 1 до 1000
 */
public class file2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if ((i % 2 == 0 && i != 2) || (i % 3 == 0 && i != 3) || (i % 5 == 0 && i != 5) || (i == 1)) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}