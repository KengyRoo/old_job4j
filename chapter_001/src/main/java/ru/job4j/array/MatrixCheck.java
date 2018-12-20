package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0][0] != data[i][i] || (data[data.length - 1][0] != data[i][data.length - i - 1])) {
                result = false;
                break;
            }
        }
        return result;
    }
}