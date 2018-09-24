package ru.job4j.condition;

/**
 * @author Aleksandr Kostyuk (KengyRoo@mail.ru)
 * @version $id$
 * @since 0.1
 */

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a,Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (ab + ac + bc)/2
     *
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     */

    public double period(double ab, double ac, double bc){
        return ((ab+ac+bc)/2.0);
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * @return Вернуть площадь, если треугольник сущ или -1, если треугольника нет.
     */

    public double area(){
        double rsl = -1; //мы устанавливает знач -1, т.к. может быть что треугольника нет.Это значение говорит о том, что треугольника нет.
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab,ac,bc);
        if (this.exist(ab,ac,bc)){
            //формула Герона для расчета площади треугольника
            rsl= Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими данными сторон.
     * @param ab Длинна от точки a b
     * @param ac Длинна от точки a c
     * @param bc Длинна от точки b c
     * @return
     */
    private boolean exist(double ab,double ac,double bc) {
        return (ab < (ac + bc) && ac < (ab + bc) && bc < (ab + ac));
    }
}
