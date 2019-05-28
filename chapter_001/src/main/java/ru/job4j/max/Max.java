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


    public int max(int first, int second, int third) {
        int tmp = max(first,second);
        return this.max(tmp, third);
    }

    public int max(int first,int second, int third, int four) {
        int pmt = max(first,second,third);
        return this.max(pmt,four);
    }
}

