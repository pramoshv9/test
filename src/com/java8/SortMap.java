package com.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {
    public static void main(String[] args) {
        Map<Integer, String > map = new HashMap<>();
        map.put(1,"pp");
        map.put(2,"ss");
        map.put(3,"aa");
        map.put(4,"bb");
        map.put(5,"cc");
        System.out.println(map);
      Map<Integer, String>  sortedMAp= map.entrySet().stream().sorted(Map.Entry.comparingByValue())
              .collect(Collectors.toMap(Map.Entry::getKey,
                      Map.Entry::getValue,
                      (o, n) ->o,
                      LinkedHashMap::new
              ) );
        System.out.println(sortedMAp);





    }
}
