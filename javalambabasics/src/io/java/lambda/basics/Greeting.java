package io.java.lambda.basics;

public class Greeting {

	public static void main(String[] args) {
		
		GreetingImplementation greeting=new GreetingImplementation();
		
		greeting.perform();
		
		//System.out.println("Hello World!");
		
		
		LamdaNoParamInterface lmbdanoparam=()->System.out.println("Lambda print!");
		
		lmbdanoparam.perform();
		
		
		LamdaStringParamInterface lmbdastringparam= s -> System.out.println(s);
		
		lmbdastringparam.perform("Lambda String param print!");
		
		
		LamdaNumParamInterface lmbdanumparam= (int a,int b) -> System.out.println(a+b);
		
		System.out.print("Lambda Addition =");
		lmbdanumparam.perform(4,5);
		

	}
	
	

public interface LamdaNoParamInterface{
	
	public void perform();
	
}

public interface LamdaStringParamInterface{
	
	public void perform(String s);
	
}

public interface LamdaNumParamInterface{
	
	public void perform(int a,int b);
	
}


}


