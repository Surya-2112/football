package com.study.mythread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	public static void main(String arg[]) {

		// ExecutorService service=Executors.newFixedThreadPool(3); // it use fixed number threads and reuse it.
		// ExecutorService service=Executors.newCachedThreadPool(); // it will create and reuse te threads and depends upon needs
		// ExecutorService service=Executors.newSingleThreadExecutor(); // it use single  thread and perform all oprations
		//ScheduledExecutorService service=  Executors.newSingleThreadScheduledExecutor();// it's use single thread and seal the oprations
		ScheduledExecutorService service = Executors.newScheduledThreadPool(3);// we can delay the threads calls
		
		int i = 0;
		for (i = 0; i < 10; i++) {
			int j = i;
			service.execute(() -> {
				System.out.println(j + " " + Thread.currentThread().getName()+"This is execute");
			});
		}
		for (i = 0; i < 10; i++) {
			int j = i;
			Future<?>f=service.submit(() -> {
				if(j>0)
				System.out.println(j+ " " + Thread.currentThread().getName()+"This is submit");
				else
				throw new RuntimeException("Error");
			}); 
		}
		
		
		IncrementRun in = new IncrementRun();
		for (i = 0; i < 10; i++) {
			service.schedule(in,10, TimeUnit.SECONDS); //it will delay and call run()
			//service.scheduleAtFixedRate(in, 10, 15, TimeUnit.SECONDS);// it will delay and call run() every 15 seconds from the start from delys
			//service.scheduleWithFixedDelay(in, 10, 10,  TimeUnit.SECONDS);//it will delay and call run every 10 seconds after compelete the oprations
		}

		service.shutdown();

	}

}
