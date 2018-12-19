package ru.job4j.array;

/*
 *Двумерный массив. Таблица умножения
 *@author Aleksandr Kostiuk (KengyRoo@main.ru)
 *@Автор Александр Костюк (KengyRoo@main)
 */

public class Matrix {
    public int[][] mutiple(int size) {
        int[][] table = new int[size][size];
        // return table;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }

        }
        return table;
    }
}
