import java.util.Scanner;
public class main {
	public static void main(String[] args) {
	 	Scanner sc =new Scanner(System.in);
	 
	 	System.out.print("enter the coefficients a, b, and c:");
		 double a = sc.nextDouble();
		 double b = sc.nextDouble();
	 	double c = sc.nextDouble() ;
	 
	 	double D =(b*b)-(4*a*c);
	 
		 if(D>0) {
	 		double root1 = (-b+Math.sqrt(D))/(2*a);
	 		double root2 = (-b-Math.sqrt(D))/(2*a);
	 		System.out.println("the equation has two real roots:" +root1 +"and" +root2);
	 	}
	 	else if(D==0) {
	 		double root =-b/(2*a);
	 		System.out.println("the equation has one real root:"+root);
	 	}
		 else {
	 		double realpart =-b/(2*a);
	 		double imaginarypart = Math.sqrt(-D)/(2*a);
	 		System.out.println("the eqation has two complex numbers:" + realpart +" + " + imaginarypart + " i and "+ realpart +" - "+ imaginarypart + " i ");
	 	}
	}
}
	 	
