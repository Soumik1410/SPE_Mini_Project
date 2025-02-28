package org.soumik;

public class Main {
    public static void main(String[] args) {
        float a,b;
	int ch = Integer.parseInt(args[0]);
	a = Float.parseFloat(args[1]);
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
		b = Float.parseFloat(args[2]);
		System.out.println(Math.pow(a,b));
	}
    }
}
