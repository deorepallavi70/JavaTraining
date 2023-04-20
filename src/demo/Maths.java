package demo;
import java.lang.*;
public class Maths {
	public void add(int a , int b) {
		int res=a+b;
		System.out.println("Addition of number:"+res);
	}

	public void substraction(int a , int b) {
		int res=a-b;
		System.out.println("substraction of number:"+res);
	}
	
	public void multiplication(int a , int b) {
		int res=a*b;
		System.out.println("multiplication of number:"+res);
	}
	public void division(int a , int b) {
		int res=a/b;
		System.out.println("division of number:"+res);
	}
	
	
	public void squreRoot(double a) {
		double res=Math.sqrt(a);
		System.out.println("squreRoot of number:"+res);
	}
	
	public void square(double a) {
		double res=Math.pow(a,2);
		System.out.println("square of number:"+res);
	}
	



	public void cube(double a) {
		double res=Math.pow(a,3);
		System.out.println("Cube of number:"+res);
	}
	
	

}
