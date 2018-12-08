package ru.job4j.array;

/**
 * Test.
 *
 * @author Aleksandr Kostiuk (mailto:KengyRoo@mail.ru)
 * @version $Id$
 * @since 0.1
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SquareTest {
    @Test
    public void whenBound3Then149(){
        int bound =3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1,4,9};
        assertThat(rst,is(expect));
    }

    @Test
    public void whenBound4Then14920() {
        int bound = 4;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9,20};
        assertThat(rst, is(expect));
    }

    @Test
    public void whenBound5Then149201() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = new int[]{1, 4, 9,20,1};
        assertThat(rst, is(expect));
    }
}
