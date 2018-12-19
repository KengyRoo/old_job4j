/**
 * Calculator
 *
 * @author Aleksandr Kostiuk
 */

package ru.job4j.calculator;

public class Calculator {
    private double result;

    /**
     * Method add
     */

    public void add(double first, double second) {

        this.result = first + second;
    }

    /**
     * Method subtract.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method div.
     */

    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multiple.
     */

    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {

        return this.result;
    }
}