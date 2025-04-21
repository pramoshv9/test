import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("pramod3");
        list.add("pramod3");
        list.add("pramod4");
        list.add("pramod5");
        list.add("pramod");
        list.add("pramod");
        list.add("pramod2");
        list.add("pramod2");



        Map<String, Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);

        Map<String, Long> map2= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter( obj -> obj.getValue()  == 1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println(map2);

      List<String>  sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
      List<String> sortedDescList = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedDescList);

    }
}
