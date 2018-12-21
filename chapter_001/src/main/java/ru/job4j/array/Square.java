package ru.job4j.array;

/**
 * Заполнить массив степенями чисел
 * @author Aleksandr Kostiuk (KengyRoo@main.ru)
 * @Автор Александр Костюк (KengyRoo@main)
 */

public class Square {
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int index = 0; index != result.length; index++) {
            result[index] = (index + 1) * (index + 1);
        }
        return result;
    }
}
