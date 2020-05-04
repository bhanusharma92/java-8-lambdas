package lamdas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) {

        List<Integer> numbers = asList(1, 2, 3, 4);
        List<Integer> sameOrder = numbers.stream().collect(toList());

        System.out.println("numbers: " + numbers);
        System.out.println("sameOrder: " + sameOrder);

        Set<Integer> set = new HashSet<>(asList(4, 3, 2, 1));
        List<Integer> sameOrderSet = set.stream().collect(toList());
        System.out.println("set: " + set);
        System.out.println("sameOrder: " + sameOrderSet);

        List<Integer> sortedSet = set.stream().sorted().collect(toList());
        System.out.println("sortedSet: " + sortedSet);

        List<Integer> incrList = numbers.stream().map(x -> x + 1).collect(toList());
        List<Integer> incrSet = set.stream().map(x -> x + 1).collect(toList());
        System.out.println("incrList: " + incrList);
        System.out.println("incrSet: " + incrSet);



    }
}
