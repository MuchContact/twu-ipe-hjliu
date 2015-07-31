package twu.exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dan on 15-7-31.
 */
public class FizzBuzzGameTest {
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
}