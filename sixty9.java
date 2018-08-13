/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int num1,num2,num;
	Scanner sc=new Scanner(System.in);
	num1=sc.nextInt();
	num2=sc.nextInt();
	if(num1>=num2)
	{
		num=num1-num2;
	}
	else
	{
		num=num2-num1;
	}
	if(num%2==0)
	System.out.println("even");
	else
	System.out.println("odd");
	}
}
