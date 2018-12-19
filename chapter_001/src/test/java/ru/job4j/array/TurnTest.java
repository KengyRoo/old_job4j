package ru.job4j.array;

/*
 * Test.
 *
 * @author Aleksandr Kostiuk (mailto:KengyRoo@mail.ru)
 * @version $Id$
 * @since 0.1
 */

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[]{2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] intput = new int[]{1, 2, 3, 4, 5};
        int[] result = turner.back(intput);
        int[] expect = new int[]{5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}
