package ru.job4j.condition;

/**
 * @author Aleksandr Kostyuk (mailto:KengyRoo@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }

    /*public static void main(String[] args) {
        Point a = new Point(0,1);
        Point b = new Point(1,5);
        //Вывод на консоль
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanceTo(b);
        System.out.println("Растояние между точками А и В =" + result);
    }

*/
}