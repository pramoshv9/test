package com.interview.question;

import java.util.*;
import java.util.stream.Collectors;

public class Java8GroupBy {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>() ;
        empList.add(new Employee(111,"Ram ","Ayodhya",2000));
        empList.add(new Employee(1,"Pramod ","Mumbai",3000));
        empList.add(new Employee(10,"Pramod2","Mumbai",1000));
        empList.add(new Employee(8,"Pramod6","Pune",7000));
        empList.add(new Employee(11,"Pramod9 ","Pune", 9000));
        empList.add(new Employee(13,"Pramod11","Varanasi",2000));
        empList.add(new Employee(17,"Pramod15 ","Varanasi",50000));

        Map<String , Long> map = empList.stream().collect(
                Collectors.groupingBy(Employee::getCity,LinkedHashMap::new, Collectors.counting())
        );

        System.out.println("Map = "+map);
        // find unique city
      Map<String, Long> uniqCityMap =  map.entrySet().stream().filter( obj -> obj.getValue() == 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(uniqCityMap);
        // sort data order by salary
       List<Employee> sortedList = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
