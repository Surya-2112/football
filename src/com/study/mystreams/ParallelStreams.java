package com.study.mystreams;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ParallelStreams {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 2; i < 10; i++) {
			map.put(i, i * i);
		}

		System.out.println(map.values());
		List<Integer> list1 = map.values().parallelStream()// this will spilt values multiple threads
										  .distinct()
										  .peek(x -> System.out.println("This is before filter:" + x + "  Thread :" + Thread.currentThread().getName()))
										  .filter(x -> x > 20).peek(x -> System.out.println("This is before Map:" + x))
										  .map(x -> (int) Math.sqrt(x)).peek(x -> System.out.println("This is After Map:" + x)).toList();

		System.out.println("--------------------------This stream:--------------------------");
		List<Integer> list2 = map.values().stream() // this use single thread
										  .distinct()
										  .peek(x -> System.out.println("This is before filter:" + x + "   Thread :" + Thread.currentThread().getName()))
										  .filter(x -> x > 20).peek(x -> System.out.println("This is before Map:" + x))
										  .map(x -> (int) Math.sqrt(x)).peek(x -> System.out.println("This is After Map:" + x)).toList();

		System.out.println(list1 + " " + list2);

	}

}
