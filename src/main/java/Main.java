import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static BigInteger perimeter(BigInteger n) {

        Integer sum = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(n.longValue()+2L)
                .map(t -> t[0])
                .collect(Collectors.summingInt(Integer::intValue));

        BigInteger bi = BigInteger.valueOf(sum);

        return bi.multiply( BigInteger.valueOf(4) );
    }


}
