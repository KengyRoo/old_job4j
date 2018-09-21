package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Aleksandr Kostyuk (mailto;KengyRoo@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class PointTest {
    @Test
    public void AtoB(){
        Point a = new Point(0,1);
        Point b = new Point(1,5);
        double result = a.distanceTo(b);
        assertThat(result,is(4.123105625617661));

    }

}
