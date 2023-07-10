package HW_6;

import java.util.Map;
import java.util.Scanner;

public class Server {
    static Scanner sc = new Scanner(System.in);

    public static void showAll(Map<Integer, NoteBook> NoteBookMap) {
        for (NoteBook lt : NoteBookMap.values()) {
            System.out.println((lt.getId() + 1) + " " + lt);
        }
        System.out.println();
    }

    public static void showCompany(Map<Integer, NoteBook> NoteBookMap, String company) {
        int count = 0;
        for (NoteBook lt : NoteBookMap.values()) {
            if (lt.getCompany().equals(company)) {
                System.out.println(lt);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Нет подходящих ноутбуков!");
        System.out.println();
    }

    public static void showCPU(Map<Integer, NoteBook> NoteBookMap, String cpu) {
        int count = 0;
        for (NoteBook lt : NoteBookMap.values()) {
            if (lt.getCpu().contains(cpu)) {
                System.out.println(lt);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Нет подходящих ноутбуков!");
        System.out.println();
    }

    public static void showGPU(Map<Integer, NoteBook> NoteBookMap, String gpu) {
        int count = 0;
        for (NoteBook lt : NoteBookMap.values()) {
            if (lt.getCpu().contains(gpu)) {
                System.out.println(lt);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Нет подходящих ноутбуков!");
        System.out.println();
    }

    public static void showRAM(Map<Integer, NoteBook> NoteBookMap, int ram) {
        int count = 0;
        for (NoteBook lt : NoteBookMap.values()) {
            if (lt.getRam() >= ram) {
                System.out.println(lt);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Нет подходящих ноутбуков!");
        System.out.println();
    }

    public static void showHDD(Map<Integer, NoteBook> NoteBookMap, int hdd) {
        int count = 0;
        for (NoteBook lt : NoteBookMap.values()) {
            if (lt.getHdd() >= hdd) {
                System.out.println(lt);
                count++;
            }
        }
        if (count == 0)
            System.out.println("Нет подходящих ноутбуков!");
        System.out.println();
    }
    
    pu blic static void filterCompany(Map<Integer, NoteBook> NoteBookMap) {
        System.out.print("1 - ASUS\n2 - Apple\n3 - Acer\n4 - Lenovo\nВыберите компанию: ");
         int num = sc.nextInt();
        String company = "";
        switch (num) {
            case 1:
                company = "ASUS";
                break;
            case 2:
                company = "Apple";
                break;
            case 3:
                company = "Acer";
                break;
            case 4:
                company = "Lenovo";
                break;
            default:
                break;
        }

        showCompany(NoteBookMap, company);
    }

    public static void filterCPU(Map<Integer, NoteBook> NoteBookMap) {
        System.out.print("1 - AMD\n2 - Apple\n3 - Intel\nВыберите производителя процессора: ");
        int num = sc.nextInt();
        String cpu = "";
        switch (num) {
            case 1:
                cpu = "AMD";
                break;
            case 2:
                cpu = "Apple";
                break;
            case 3:
                cpu = "Intel";
                break;
            default:
                break;
        }
        showCPU(NoteBookMap, cpu);
    }

    public static void filterGPU(Map<Integer, NoteBook> NoteBookMap) {
        System.out.print("1 - GeForce\n2 - Apple\n3 - Intel\nВыберите производителя видеокарты: ");
        int num = sc.nextInt();
        String gpu = "=";
        switch (num) {
            case 1:
                gpu = "GeForce";
                break;
            case 2:
                gpu = "Apple";
                break;
            case 3:
                gpu = "Intel";
                break;
            default:
                break;
        }
        showGPU(NoteBookMap, gpu);
    }

    public static void filterRAM(Map<Integer, NoteBook> NoteBookMap) {
        System.out.print("Минимальный объём оперативной памяти: ");
        int ram = sc.nextInt();
        showRAM(NoteBookMap, ram);
    }

    public static void filterHDD(Map<Integer, NoteBook> NoteBookMap) {
        System.out.print("Минимальный объём жёсткого диска: ");
        int hdd = sc.nextInt();
        showHDD(NoteBookMap, hdd);
    }

    public static void filter(Map<Integer, NoteBook> NoteBookMap) {
        System.out.println(
                "Введите цифру, соответствующую необходимому критерию:\n1 - Компания\n2 - Процессор\n3 - Видеокарта\n4 - ОЗУ\n5 - ПЗУ");
        int num = sc.nextInt();
        sc.nextLine();

        switch (num) {
            case 1:
                System.out.println();
                filterCompany(NoteBookMap);
                break;

            case 2:
                System.out.println();
                filterCPU(NoteBookMap);
                break;

            case 3:
                System.out.println();
                filterGPU(NoteBookMap);
                break;
            
            case 4:
                System

                break;
            
            case 5:
                System

                break;

            default:
                System.out.println();
                System.out.println("Задача не распознана, повторите!");
                break;
        }

    }
}

 
