package test;

import org.junit.Test;
import primefactor.PrimeFactor;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by nataliadjohari on 17/02/2017.
 */
public class PrimeFactorTest {
    @Test
    public void primeFactorTest1() {
        List<Integer> factors = PrimeFactor.generate(1);
        assertThat(factors.size(), is(0));
    }

    @Test
    public void primeFactorTest2() {
        List<Integer> factors = PrimeFactor.generate(2);
        assertThat(factors.size(), is(1));
        assertThat(factors.get(0), is(2));
    }

    @Test
    public void primeFactorTest12() {
        List<Integer> factors = PrimeFactor.generate(12);
        assertThat(factors.size(), is(2));
        assertThat(factors.get(0), is(2));
        assertThat(factors.get(1), is(3));
    }

    @Test
    public void primeFactorTest16() {
        List<Integer> factors = PrimeFactor.generate(16);
        assertThat(factors.size(), is(1));
        assertThat(factors.get(0), is(2));
    }

    @Test
    public void primeFactorTest30() {
        List<Integer> factors = PrimeFactor.generate(30);
        assertThat(factors.size(), is(3));
        assertThat(factors.get(0), is(2));
        assertThat(factors.get(1), is(3));
        assertThat(factors.get(2), is(5));
    }
}
