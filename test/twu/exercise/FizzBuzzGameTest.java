package twu.exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dan on 15-7-31.
 */
public class FizzBuzzGameTest {
    @Test
    public void should_1_print_1() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertEquals("1", fizzBuzzGame.FizzBuzz(1));

    }

    @Test
    public void should_divisible_by_3_print_fizz() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertEquals("Fizz", fizzBuzzGame.FizzBuzz(3));
    }

    @Test
    public void should_divisible_by_5_print_buzz() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertEquals("Buzz", fizzBuzzGame.FizzBuzz(5));

    }

    @Test
    public void should_divisible_by_3_and_5_print_fizzbuzz() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        assertEquals("FizzBuzz", fizzBuzzGame.FizzBuzz(15));
    }

    @Test
    public void should_prime_factors_of_1_be_empty() throws Exception {
        PrimeFactorCalculator primeFactorCalculator = new PrimeFactorCalculator();
        assertEquals("[]", primeFactorCalculator.generate(1).toString());

    }

}
