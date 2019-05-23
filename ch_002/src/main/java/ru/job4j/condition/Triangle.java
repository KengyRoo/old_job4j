package ru.job4j.condition;

/**
 * @author Aleksandr Kostyuk (KengyRoo@mail.ru)
 * @version $id$
 * @since 0.1
 */

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     * Формула.
     * (ab + ac + bc)/2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     */

    public double period(double a, double b, double c) {
        return ((a + b + c) / 2.0);
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * @return Вернуть площадь, если треугольник сущ или -1, если треугольника нет.
     * мы устанавливает знач -1, т.к. может быть что треугольника нет.Это значение говорит о том, что треугольника нет.
     */

    public double area() {
        double result = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return result;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими данными сторон.
     *
     * @param a Длинна от точки a b
     * @param b Длинна от точки a c
     * @param c Длинна от точки b c
     * @return
     */
    private boolean exist(double a, double b, double c) {
        return (a < (b + c) && b < (a + c) && c < (a + b));
    }
}

