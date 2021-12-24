package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stringStream = sList.stream();
        stringStream.forEach(s -> System.out.println(s));

        sList.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();

        sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
    }
}
