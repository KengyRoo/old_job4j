package ru.job4j.array;

/*
 *@author Aleksandr Kostiuk (KengyRoo@main.ru)
 *@Автор Александр Костюк (KengyRoo@main)
 */


public class Check {
    public boolean mono(boolean[] data){
        boolean result = false;
        for (int i=1; i<data.length; i++) {
            if (data[i]== data[i-1] ) {
                result = true;
                break;
            }
        }
        return result;
    }
}
