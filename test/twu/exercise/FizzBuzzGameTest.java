package twu.exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dan on 15-7-31.
 */
public class FizzBuzzGameTest {

    private final PrimeFactorCalculator primeFactorCalculator = new PrimeFactorCalculator();
    private final FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

    @Test
    public void should_1_print_1() throws Exception {
        assertEquals("1", fizzBuzzGame.FizzBuzz(1));
    }

    @Test
    public void should_divisible_by_3_print_fizz() throws Exception {
        assertEquals("Fizz", fizzBuzzGame.FizzBuzz(3));
    }

    @Test
    public void should_divisible_by_5_print_buzz() throws Exception {
        assertEquals("Buzz", fizzBuzzGame.FizzBuzz(5));
    }

    @Test
    public void should_divisible_by_3_and_5_print_fizzbuzz() throws Exception {
        assertEquals("FizzBuzz", fizzBuzzGame.FizzBuzz(15));
    }

    @Test
    public void should_prime_factors_of_1_be_empty() throws Exception {
        assertEquals("[]", primeFactorCalculator.generate(1).toString());
    }

    @Test
    public void should_prime_factors_of_30_be_2_3_5() throws Exception {
        assertEquals("[2, 3, 5]", primeFactorCalculator.generate(30).toString());
    }
}
