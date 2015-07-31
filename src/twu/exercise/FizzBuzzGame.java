package twu.exercise;

/**
 * Created by dan on 15-7-31.
 */
public class FizzBuzzGame {
    public String FizzBuzz(int number) {
        StringBuffer stringBuffer = new StringBuffer();
        if(number%3 == 0){
            stringBuffer.append("Fizz");
        }
        if(number%5 == 0){
            stringBuffer.append("Buzz");
        }
        return stringBuffer.length()>0?stringBuffer.toString():(""+number);
    }
}
