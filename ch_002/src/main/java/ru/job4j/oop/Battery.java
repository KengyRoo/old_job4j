package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size){
        this.load = size;
    }

    public void exchange(Battery another){
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args){
        Battery first = new Battery(80);
        Battery second = new Battery(20);
        System.out.println("Зарядка иточника:" + first.load + ". зарядка батареи  :" + second.load);
        first.exchange(second);
        System.out.print("Зарядка источника : " + first.load + ". зарядкабатареи : " + second.load);
    }
}
