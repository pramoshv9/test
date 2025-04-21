package com.java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatrInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,5,6,};
        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(obj -> obj.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map);
    }

}
