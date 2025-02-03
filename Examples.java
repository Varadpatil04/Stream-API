package Data;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Examples {
    public static void main(String[] args) {
        Data data = new Data();
        List<Integer> s = data.getNums();
        List<String> str = data.getString();



        // Doubling the intergers
//        System.out.print("Before ");
//        s.forEach(n-> System.out.print(n+" "));
//        System.out.println();
//        System.out.print("After ");
//        s.stream()
//              .map(n->n*2)
//              .forEach(n-> System.out.print(n +" "));



        //Sorting interger
//        System.out.print("Before ");
//        s.forEach(n-> System.out.print(n+" "));
//        System.out.println();
//        System.out.print("After ");
//        s.stream()
//                .sorted()
//                .forEach(n-> System.out.print(n+" "));


        //Sorting string in ascending
//        System.out.print("Before :");
//        str.forEach(n-> System.out.print(n+", "));
//        System.out.println();
//        System.out.print("After :");
//        str.stream()
//                .sorted()
//                .forEach(n-> System.out.print(n+", "));


        //Sortingin Descending
//        System.out.print("Before :");
//        s.forEach(n-> System.out.print(n+", "));
//        System.out.println();
//        System.out.print("After :");
//        s.stream()
//                .sorted((a,b)->(b - a))
//                .forEach(n-> System.out.print(n+", "));



        //Sorting string in Descending
//        System.out.print("Before :");
//        str.forEach(n-> System.out.print(n+", "));
//        System.out.println();
//        System.out.print("After :");
//        str.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(n-> System.out.print(n+", "));



        //count
//        System.out.print("Before ");
//        s.forEach(n-> System.out.print(n+" "));
//        System.out.println();
//        System.out.print("Count: ");
//        Long c = s.stream()
//                .count();
//        System.out.println(c);




        // Removing duplicates
//        System.out.print("Before ");
//        s.forEach(n-> System.out.print(n+" "));
//        System.out.println();
////      System.out.print("After ");
//        s.stream()
//                .distinct()
//                .forEach(n-> System.out.print(n+" "));


        //Even - Odd
//        System.out.print("Before ");
//        s.forEach(n-> System.out.print(n+" "));
//        System.out.println();
//        System.out.print("Even: ");
//        s.stream()
//                .filter(n->n%2==0)
//                .forEach(n-> System.out.print(n+" "));



        //Min-Max
//        System.out.print("Before ");
//        s.forEach(n-> System.out.print(n+" "));
//        System.out.println();
//        System.out.print("Max: ");
//        int max = s.stream()
//                .max(Integer::compare)
//                .orElse(0);
//        System.out.println(max);




        //Sum of Integers
//        System.out.print("Before ");
//        s.forEach(n-> System.out.print(n+" "));
//        System.out.println();
//        System.out.print("Sum: ");
//        int sum = s.stream()
//                .reduce(0,(integer, integer2) -> integer+integer2);
//        System.out.println(sum);


        //UpperCase
//        System.out.print("Before ");
//        str.forEach(n-> System.out.print(n+" "));
//        System.out.println();
//        System.out.print("After ");
//        str.stream()
//                .map(n->n.toUpperCase())
//                .forEach(n-> System.out.print(n+" "));




        // Count occurance of any element
//        String abc = "Hello World";
//        int count = (int) abc.chars().filter(x->x == 'o').count();
//        System.out.println(count);



        //Factorial => new method
//        s.stream().map(x->Factorial(x)).forEach(x-> System.out.println(x+ " "));


        //Cummulative sum
//        AtomicInteger sum = new AtomicInteger(0);
//        s.stream().map(x->sum.addAndGet(x)).forEach(System.out::println);







        // examples
//        str.stream().filter(n->n.length()>5).forEach(n-> System.out.println(n+" "));






    }

//    public static long Factorial(int x){
//        long fact = 1;
//        for (int i = x; i > 0; i--) {
//            fact = fact*i;
//        }
//        return fact;
//    }



}
