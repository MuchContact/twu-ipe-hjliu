package twu.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dan on 15-8-1.
 */
public class PrimeFactorCalculator {
    public List<Integer> generate(int number) {
        if(number<1) {
            throw new IllegalArgumentException("number should be bigger than 0!");
        }
        List<Integer> list = new ArrayList<>();
        for(int i=2; i<=number; i++){
            if(number%i == 0){
                list.add(i);
                number = removeFactorRecursivelyForNumber(number, i);
            }
        }
        return list;
    }

    private int removeFactorRecursivelyForNumber(int number, int factor) {
        while(number%factor == 0){
            number = number/factor;
        }
        return number;
    }
}
