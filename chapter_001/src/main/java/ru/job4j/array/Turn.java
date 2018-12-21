package ru.job4j.array;

/*
 *Перевернуть массив
 *@author Aleksandr Kostiuk (KengyRoo@main.ru)
 *@Автор Александр Костюк (KengyRoo@main)
 */

public class Turn {
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}
