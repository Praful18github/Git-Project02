package com.praful.newfeature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImplUsingStream {

	public static void main(String[] args) {
		
		List<Employee> listemp=Arrays.asList(new Employee(101,"Pritam",45000),new Employee(102,"Riya",60000),new Employee(103,"Shlok",70000),new Employee(104,"priya",75000),new Employee(105,"Chetan",60000));
        List<Integer> collect = listemp.stream().map(e->e.getSal()).distinct().collect(Collectors.toList());
        System.out.println(collect);
	}

}
