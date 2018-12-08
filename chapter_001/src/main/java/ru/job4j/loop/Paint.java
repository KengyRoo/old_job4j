package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * @author Aleksandr Kostyuk (mailto;KengyRoo@mail.ru)
 * @version $Id$
 * @since 0.1
 */


public class Paint {

    public String rightTtl (int height) {
        return  this.loopBy(
                height,
                height,
                (row,column) -> row >= column
        );
    }

    public String leftTrl(int height){
       return this.loopBy(
               height,
               height,
               (row, column) -> row >= height - column -1
       );
    }

    public String pyramid (int heigth) {
        return this.loopBy(
                heigth,
                2 * heigth - 1,
                (row, column) -> row >= heigth - column - 1 && row + heigth - 1 >= column
        );
    }

    private String loopBy(int height, int weight, BiPredicate<Integer,Integer> predict){
        StringBuilder screen = new StringBuilder();
        for (int row=0; row!= height; row++){
            for (int column = 0; column !=weight; column++){
                if (predict.test(row,column)) {
                    screen.append("^");
                }else{
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}