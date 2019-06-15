package test;

class A{  
	A(){System.out.println("hello a");}  
	A(int x){  
		this();  
		System.out.println(x);  
	}
	A(double x){    
		System.out.println(x);  
	}
}  

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();  
	}
}