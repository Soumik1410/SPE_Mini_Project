package org.soumik;
import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true)
	{
	float a,b;
	System.out.println("Calculator\n1. Enter 1 for Sqaure Root\n2. Enter 2 for Factorial\n3. Enter 3 for Natural Log\n4. Enter 4 for Power\n5. Enter 5 to exit\n");
	int ch = sc.nextInt();
	if(ch == 5)
		System.exit(0);
	System.out.print("Enter number 1 : ");
	a = sc.nextFloat();
	System.out.println();
	if(ch == 1)
	{
		System.out.println(Math.sqrt(a));
	}
	else if(ch == 2)
	{
		int result = 1;
		for (int i = 2; i <= a; i++)
	            result *= i;
		System.out.println(result);
        }
	else if(ch == 3)
	{
		System.out.println(Math.log(a));
	}
	else if(ch == 4)
	{
		System.out.print("Enter exponent : ");
		b = sc.nextFloat();
		System.out.println("\n" + Math.pow(a,b));
	}
	System.out.println("\n");
	}
    }
}
