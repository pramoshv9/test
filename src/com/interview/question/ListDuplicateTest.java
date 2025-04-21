package com.interview.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListDuplicateTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Ram");
        list.add("Sita");
        list.add("Ram");
        list.add("Sita");
        list.add("Shiva");
        list.add("Shiva");
        list.add("Ram");
        list.add("Dev");
        list.add("Dev");
        list.add("Ram");
        list.add("ok");


       Map<String , Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
               .entrySet().stream().filter(obj -> obj.getValue() == 1)
               .collect(Collectors.toMap(Map.Entry ::getKey, Map.Entry::getValue));
        System.out.println(map);



    }
}
