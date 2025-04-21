package com.java8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateInList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("pramod");
        list.add("pramod");
        list.add("shivansh");
        list.add("shivansh");
       // list.add("shivansh");
        list.add("shashi");
        list.add("sanvi");
        list.add("krisha");
        list.add("sanvi");
        list.add("amit");
        list.add("amit");


        Map<String, Long> map =  list.stream().sorted().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(obj ->obj.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));


        System.out.println(map);



    }
}
