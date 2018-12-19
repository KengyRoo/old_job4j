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

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = bubble.sort(input);
        assertThat(result, is(new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8}));
    }

    @Test
    public void whenSortArray5ElementsThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[]{8, 3, 5, 1, 4};
        int[] result = bubble.sort(input);
        assertThat(result, is(new int[]{1, 3, 4, 5, 8}));
    }
}
