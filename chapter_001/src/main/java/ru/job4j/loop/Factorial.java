package ru.job4j.loop;

/**
 * @author Aleksandr Kostyuk (mailto;KengyRoo@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Factorial {

   public int factorial(int num) {
       if (num == 0) return 1;
       return num * factorial(num - 1);
   }
}