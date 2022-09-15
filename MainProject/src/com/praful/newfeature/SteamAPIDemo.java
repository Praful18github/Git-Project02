package com.praful.newfeature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamAPIDemo {

	public static void main(String[] args) {
	    
		//Ex-1
//		List<Integer> list=Arrays.asList(2,4,3,6,8,7,9);
//		List<Integer> collect = list.stream().map(x->x*x).collect(Collectors.toList());
//		System.out.println(list);
//		System.out.println(collect);
		
//		Ex-2
//		List<String> al=Arrays.asList("1","2","3","4","5","6","7","8","9","10");
//		List<Integer> even = al.stream().map(str->Integer.valueOf(str)).filter(num->num%2==0).collect(Collectors.toList());
//        System.out.println(al);
//        System.out.println(even);
		
//		Ex-3
//		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		List<Integer> odd= li.stream().filter(n->n%2==1).collect(Collectors.toList());
//		System.out.println(li);
//        System.out.println(odd);
		
//		Ex-4
//		List<Integer> li=Arrays.asList(1,2,3,4);
//		li.stream().map(n->n*3).forEach(x->System.out.println(x));
		
//		Ex-5
//		List<String> list=Arrays.asList("Praful","shrikant","hemangini","pankaj");
//		list.stream().map(s->s.length()).forEach(y->System.out.println(y));
		
		//Example-5
		List<Integer> lii=Arrays.asList(100,40,50,22,120,90,80);
		Integer max= lii.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println(max);
		
	}

}
