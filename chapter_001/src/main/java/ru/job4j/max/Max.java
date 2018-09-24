package ru.job4j.max;

/**
 * @author Aleksandr Kostyuk (KengyRoo@mail.ru)
 * @version $id$
 * @since 0.1
 */

public class Max {


    public int max(int first, int second) {
        return (first > second) ? first : second;
    }


    public int max(int first,int second,int third){
        int temp = this.max(max(first, second),third);
        return temp;
    }
}



