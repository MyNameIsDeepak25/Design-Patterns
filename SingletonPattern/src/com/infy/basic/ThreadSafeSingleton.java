package com.infy.basic;

public class ThreadSafeSingleton {
	
	
	private static volatile ThreadSafeSingleton theSafeSingleton;
	
	private ThreadSafeSingleton() {
		System.out.println("getting instance");
	}
	
	public static ThreadSafeSingleton getInstance() {
		if(theSafeSingleton==null) {
			synchronized (ThreadSafeSingleton.class) {
				if(theSafeSingleton == null ) {
					theSafeSingleton=new ThreadSafeSingleton();
				}
				
			}
		}
		return theSafeSingleton;
	}

	
	public static void main(String[] args) {
		
	
		Runnable r = ()->{
		ThreadSafeSingleton instance = getInstance();
			System.out.println(Thread.currentThread().getName() + " " + instance);
		};
		
		for (int i = 0; i < 10; i++) {
			new Thread(r).start();
			
		}
		
		
	}

	
}
