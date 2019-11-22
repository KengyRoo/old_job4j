package ru.job4j.tracker;

import java.util.Scanner;

public class StatUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                for (Item item : tracker.findAll()) {
                    System.out.println(item.getName() + " (" + item.getId() + ")");
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Элемент успешно удален");
                } else {
                    System.out.println("Не удалось найти элемент по указанному ID.");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by ID ====");
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item.getName() + " (" + item.getId() + ")");
                } else {
                    System.out.println("Не удалось найти элемент по указанному ID.");
                }
            } else if (select == 5) {
                System.out.println("=== Find item by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] itemArr = tracker.findByName(name);
                if (itemArr.length != 0) {
                    for (Item item : itemArr) {
                        System.out.println(item.getName() + " (" + item.getId() + ")");
                    }
                } else {
                    System.out.println("Не удалось найти элемент(ы) по указанному name.");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
