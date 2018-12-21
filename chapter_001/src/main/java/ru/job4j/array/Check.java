package ru.job4j.array;

/*
 *Массив заполнен true или false
 *@author Aleksandr Kostiuk (KengyRoo@main.ru)
 *@Автор Александр Костюк (KengyRoo@main)
 */


public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
