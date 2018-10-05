package ru.job4j.loop;

/**
 * @author Aleksandr Kostyuk (mailto;KengyRoo@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Factorial {

   public int factorial(int num) {
       int result = 1;
       if (num == 0) {
           return result;
       } else {
           for (int i = 1; i <= num; i++) {
           result = result * i;
       }
   }
       return result;
   }
}