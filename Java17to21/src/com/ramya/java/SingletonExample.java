package com.ramya.java;

public final class SingletonExample {
	
	private static  SingletonExample singletonExampleInstance;
	
	private SingletonExample() {
		
	}
	
//	public SingletonExample getInstance(SingletonExample inputInstance) {
//		
//		if(inputInstance == null) {
//			singletonExampleInstance = new SingletonExample();
//		}
//		else {
//			singletonExampleInstance = inputInstance;
//		}
//		
//		return singletonExampleInstance;
//	}
	
	public static SingletonExample getInstance() {
		
		if(singletonExampleInstance == null) {
			singletonExampleInstance = new SingletonExample();
		}
		
		
		return singletonExampleInstance;
	}
	
	
//	public static SingletonExample getInstance(String abc) {
//		
//		return new SingletonExample();
//	
//	}
//	
	

}
