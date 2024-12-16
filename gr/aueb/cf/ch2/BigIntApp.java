package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class BigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("123456798989273646");
        BigInteger bigNum2 = new BigInteger("41546545446486876868");
        BigInteger result;    

        result = bigNum1.add(bigNum2);
        System.out.printf("%,d", result);
    }
}
