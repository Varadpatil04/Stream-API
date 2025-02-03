package Data;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        Data data = new Data();
        List<Integer> s = Stream.iterate(1,x->x+1).limit(25500).toList();
        List<String> str = data.getString();

        System.out.println("Using Stream ");
        long start = System.currentTimeMillis();
        List<Long> abcd = s.stream().map(x->Factorial(x)).toList();
        long end = System.currentTimeMillis();
        System.out.println("Time taken : " + (end-start));



        System.out.println("Using ParallelStream");
        long starting = System.currentTimeMillis();
        List<Long> abcde = s.parallelStream().map(x->Factorial(x)).toList();
        long ending = System.currentTimeMillis();
        System.out.println("Time taken : " + (ending-starting));



//        For 500 units time taken : Stream:1 , ParallelStream:6
//        For 2500 units time taken : Stream:6 , ParallelStream:6
//        For 25500 units time taken : Stream:260 , ParallelStream:31

    }
    public static long Factorial(int x){
        long fact = 1;
        for (int i = x; i > 0; i--) {
            fact = fact*i;
        }
        return fact;
    }
}
