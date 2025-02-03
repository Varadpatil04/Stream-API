package Data;

import java.util.List;

public class OpsDemo {
    public static void main(String[] args) {


        Data data = new Data();
        List<Integer> s = data.getNums();
        List<String> str = data.getString();



        //Generating Stream from 1 - 100
//        Stream.iterate(1,n->n+1).limit(100).peek(n-> System.out.print(n+" "));


        //        Intermidiate ops ==>
//        filter - map - distinct - sorted - distinct - peek are intermidiate ops

        //using map
//        s.stream().map(x->x*2).forEach(n-> System.out.println(n+" "));

//        using filter
//        s.stream().filter(x->x%2==0).forEach(n-> System.out.println(n+" "));


//        using reduce
//        int a = s.stream().reduce(0,(c,e)->c+e);
//        System.out.println(a);

//        Using sorted
//        s.stream().sorted().forEach(n-> System.out.println(n+" "));

//        Using disticnt
//        s.stream().distinct().forEach(n-> System.out.println(n+" "));


        // Using Skip and limit
//        Stream.iterate(1,x -> x+1).skip(2).limit(10).forEach(x-> System.out.print(x + " "));

        //Flatmap
//        List<List<String>> list = Arrays.asList(
//                Arrays.asList("Varad","Raj"),
//                Arrays.asList("Kaus","snehal"),
//                Arrays.asList("nirmal","Vaish")
//        );
//
//        list.stream().flatMap(x->x.stream()).map(x->x.toUpperCase()).forEach(System.out::println);



        // Terminal ops ==>


        // Using count
//        Long c = s.stream().count();
//        System.out.println(c);

        // anymatch , allmatch , nonematch
//        System.out.println(s.stream().allMatch(x->x>=0));
//        System.out.println(s.stream().anyMatch(x->x%2==0));
//        System.out.println(s.stream().noneMatch(x->x<0));

        //findfirst findany
//        System.out.println(s.stream().findFirst().orElse(0));
//        System.out.println(s.stream().findAny().orElse(0));

        //toArray
//        Object a[] = s.stream().toArray();
//        System.out.println(Arrays.toString(a));

        //min - max
//        sout(s.stream()
//                .max(Integer::compare)
//                .orElse(0))


//        A whole example of stream
//        s.stream()
//                    .filter(p -> p % 2 == 0)   // Filter odd no
//                    .map(p -> p * 2)    // multiple the nos by 2
//                    .distinct()         // remove duplicates
//                    .sorted()           // Sort the list
//                    .peek(n->System.out.println(n + " "))
//                    .count();
    }
}