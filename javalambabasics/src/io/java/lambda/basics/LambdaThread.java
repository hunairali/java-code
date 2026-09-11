package io.java.lambda.basics;

public class LambdaThread {

	public static void main(String[] args) {
		

		
		Thread myThread=new Thread(new Runnable() {

			@Override
			public void run() {
				
				System.out.println("Thread printing!");
				
				
			}
			
			
			
			
		});
		
		myThread.run();
		
		
		Thread lambdaThread= new Thread( ()-> System.out.println("Lambda Thread!") );
		
		lambdaThread.run();
		

	}
	
	
	

}
