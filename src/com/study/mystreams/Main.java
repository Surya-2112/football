package com.study.mystreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			l.add(i);
			if(i%2==0)
				l.add(i);
		}
		
		System.out.println(l.toString());

		List<Integer> list1 = l.stream().filter((x) -> x % 2 == 0).sorted((x,y) -> y-x).toList();
		List<Integer> list2 = l.stream().filter((x) -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		//list1.add(10); //It's Immutable Collections as list
		list2.add(10);
		//System.out.println(list1.toString());
		System.out.println(list2.toString());
		

		boolean all = l.stream().allMatch(x -> x.TYPE == Integer.TYPE);
		System.out.println("All : "+all +" "+Integer.TYPE);

		boolean any = l.stream().anyMatch(x -> x % 2 == 0);
		System.out.println("Any : "+any);
		
		boolean none = l.stream().noneMatch(x -> x % 2 == 0);
		System.out.println("Nonw :"+none);
		
		int count=(int)l.stream().distinct().count();
		System.out.println(count);
		
		Map<Integer , Integer> map1= IntStream.range(0,count) // this only allow the indexing 
				//.distinct() this is waste it give the values in range 
				.boxed()
				.collect(Collectors.toMap(i-> i,x-> list1.get(x)*2));
		System.out.println(map1);
		
		System.out.println("This is from Streams:");
		Map<Integer,Integer> map2=l.stream() //this not allow indexing and it works on value
								   .distinct()
								   .collect(Collectors.toMap(x-> x,x -> x));
		
		map2.forEach((Key,Value) -> System.out.println(Key+" "+Value));
		
		List<Integer> list3=l.stream()
							 .map(x-> x*-1)
							 .limit(l.size()/2)
							 .toList();
		List<Integer> list4=l.stream()
				 			 .map(x-> x*-1)
				 			 .skip(l.size()/2)
				 			 .toList();
		System.out.println(list3+" "+list4);
		
		//flatMap() is used nestedcollections and nestArrays 
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=i*j+j+i;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		List<Integer> list5= Arrays.stream(arr)
								   .map(x -> Arrays.stream(x).sum())
								   .toList();
		System.out.println(list5);
		
		List<Integer> list6=Arrays.stream(arr)
								  .flatMap(x-> Arrays.stream(x).boxed())
								  .toList();
		
		Arrays.stream(arr).flatMapToInt(x-> Arrays.stream(x)).boxed().toList();
		
		System.out.println(list6);
		
		List<Integer> list7=list6.stream().dropWhile(x-> x<3 ).toList();// remove the element before conditions false
		System.out.println(list7);
		
		
		List<String> l1=new ArrayList<>();
		for(int i=0;i<5;i++) l1.add(i+"");
		l1.add(""
				+ ""
				+ ""
				+ ""
				+ "hi");
		int max=l1.stream()
				.peek(x->System.out.println(" this first peek = "+ x))
				 .mapToInt( x->{
				 	try{
				 		return Integer.parseInt(x);
				 	}catch(Exception e) { 
				 		System.out.println("It's not a Integer");
				 		return 0;
				 		}
					})
				 .peek(x->System.out.println(" this next peek = "+ x))
				 .max()
				 .orElse(0);
		
		System.out.println(l1+" max= "+max);
		
		int sum=l.stream().reduce((a,b)->a+b).get();// it returns optional class
		System.out.println(sum);
	}
}
