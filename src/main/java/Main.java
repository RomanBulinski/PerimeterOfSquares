import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static BigInteger perimeter(BigInteger n) {

        BigInteger sum = new BigInteger("1");
        BigInteger counter = new BigInteger("0");
        BigInteger m = new BigInteger("0");
        BigInteger mm = new BigInteger("1");


        while( counter.compareTo(n) < 0){

            BigInteger temp;
            temp = mm;
            mm= m.add(mm);
            m = temp;
            sum = sum.add(mm);

            BigInteger one = new BigInteger("1");
            counter = counter.add(one);
        }
        return sum.multiply( BigInteger.valueOf(4) );
    }


}
