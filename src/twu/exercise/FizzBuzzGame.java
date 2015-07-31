package twu.exercise;

/**
 * Created by dan on 15-7-31.
 */
public class FizzBuzzGame {
    public String FizzBuzz(int number) {

        if(number%3 == 0){
            return "Fizz";
        }
        if(number%5 == 0){
            return "Buzz";
        }
        return ""+number;
    }
}
