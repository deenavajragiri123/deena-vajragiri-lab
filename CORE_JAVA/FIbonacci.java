package CORE_JAVA;

import java.util.Scanner;

class Fib {

public static void main(String args[ ]) {

try (Scanner input = new Scanner(System.in)) {
	int i,a=1,b=1,c=0,n;
	
	System.out.print("Enter value of n: ");
	
	n=input.nextInt();
	
	System.out.print(a);
	
	System.out.print(" "+b);
	
	for(i=0;i<n-2;i++) {
	
	c=a+b;
	
	a=b;
	
	b=c;
	
	System.out.print(" "+c);
	
	}
}

System.out.println();

String n = null;
String c = null;
System.out.print(n+"th number of the series is: "+c);

}

}