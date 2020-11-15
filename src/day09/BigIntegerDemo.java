package day09;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 大整形操作
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        //int num = 1837284364736746374;
        BigInteger bi = new BigInteger("1837284364736746374");
        BigInteger bi1 = new BigInteger("3276743615652643564");
        System.out.println(bi.add(bi1));
        System.out.println(bi.multiply(bi1));
        System.out.println(bi.subtract(bi1));
        float f = 483674637647364734736473647368236382.4837843674673647364364736473674364736386483648363826327436746374637f;
        System.out.println(f);
        BigDecimal bd = new BigDecimal("0.4837843674673647367436746374637");
        System.out.println(bd);

    }
}
