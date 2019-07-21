import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static BigInteger perimeter(BigInteger n) {

//        Integer sum2 = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
//                .limit(n.longValue()+2L)
//                .map(t -> t[0])
//                .collect(Collectors.summingInt(Integer::intValue));
//        BigInteger sum = new BigInteger();
//        for(BigInteger i = 0; i<n; i++  ){

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

//            System.out.println("m : "+m);
//            System.out.println("mm : "+mm);
//            System.out.println("sum : "+sum);
//            System.out.println("couter : "+counter);
//            System.out.println("----------------------");
        }

        return sum.multiply( BigInteger.valueOf(4) );

    }


}
