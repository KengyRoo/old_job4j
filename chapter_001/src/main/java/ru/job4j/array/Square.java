package ru.job4j.array;

/**
 * @author Aleksandr Kostiuk (KengyRoo@main.ru)
 * @Автор Александр Костюк (KengyRoo@main)
 */

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index != rst.length; index++) {
            rst[index] = (index + 1) * (index + 1);
        }
        return rst;
    }
}
