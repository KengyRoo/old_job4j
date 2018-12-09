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


public class FindLoopTest {

    @Test
    public void whenArrayHasLengh5Then0(){
        FindLoop find = new FindLoop();
        int[] input = new int[]{5,10,3};
        int value = 5;
        int result = find.indexOf(input,value);
        int expext = 0;
        assertThat(result,is(expext));
    }

    @Test
    public void whenArrayHasLengh8ThenNo(){
        FindLoop find = new FindLoop();
        int[] input = new int[]{5,10,3};
        int value = 8;
        int result = find.indexOf(input,value);
        int expext = -1;
        assertThat(result,is(expext));
    }
}
