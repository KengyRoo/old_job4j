package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }
    @Test
    public void When5DollarToRubleThen300(){
        Converter converter = new Converter();
        int result = converter.DollarToRuble( 5);
        assertThat(result, is( 300));

    }
    @Test
    public void When5EuroToRubleThen350(){
        Converter converter = new Converter();
        int result = converter.EuroToRuble(5);
        assertThat(result, is(350));
    }
}