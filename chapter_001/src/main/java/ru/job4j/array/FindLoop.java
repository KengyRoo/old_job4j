package ru.job4j.array;

/*
 *Классический поиск перебором
 *@author Aleksandr Kostiuk (KengyRoo@main.ru)
 *@Автор Александр Костюк (KengyRoo@main)
 */


public class FindLoop {
    public int indexOf(int[] data, int el) {
        int result = -1;
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }
}
