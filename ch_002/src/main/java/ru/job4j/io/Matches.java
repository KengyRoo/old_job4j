package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int all = 11;
        int player = 1;

        while (all > 0) {
            boolean run = true;
            while (run) {
                System.out.print("Игрок " + player + " возмите со стола от 1 до 3 спичек: ");
                int get = Integer.valueOf(input.nextLine());
                if (get >= 1 && get <= 3) {
                    run = false;
                    all -= get;
                    System.out.println("Осталось " + Math.max(0, all) + " спичек.");
                    if (all <= 0) {
                        System.out.println("Игрок " + player + " победил!");
                    }
                    player = (player == 1) ? 2 : 1;
                } else {
                    System.out.println("Неправильое количество спичек, нужно выбрать от 1 до 3");
                }
            }
        }
    }
}