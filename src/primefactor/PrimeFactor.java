package primefactor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nataliadjohari on 14/02/2017.
 */
public class PrimeFactor {
    /**
     * given an integer N will return a list of integers such that the numbers
     * are the factors of N and are arranged in increasing numerical order.
     * @param n
     * @return
     */
    public static List<Integer> generate(int n) {
        ArrayList<Integer> primeList = new ArrayList<Integer>();

        boolean even = false;
        int number = n;
        while( (number & 1) == 0) {
            even = true;
            number /= 2;
        }

        if(even) {
            primeList.add(2);
        }

        // Every composite number has at least one prime factor
        // less than or equal to square root of itself.
        int max = (int) Math.sqrt(n);
        int prime = 3;
        boolean add = true;
        while(prime <= max) {
            if(number % prime == 0) {
                if (add) {
                    primeList.add(prime);
                    add = false;
                }
                number /= prime;
            } else {
                prime += 2;
                add = true;
            }
        }

        return primeList;
    }
}
