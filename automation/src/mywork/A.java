package mywork;

import java.util.Scanner;
class Program7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range: ");
		int p=sc.nextInt();
		int count=0;
		for(int i=1;i<=p;i++)
		{
			if(findSum(i)==i)
			{
				System.out.print(i+"   ");
				count++;
			}
		}
		System.out.println("\n"+"Total ArmStrong upto "+p+" is: "+count);
	}
	public static int findSum(int n)
	{
		int sum=0;
		int x=countDigit(n);
		while(n>0)
		{
			int rem=n%10;
			sum=sum+findPower(rem, x);
			n=n/10;
		}
	return sum;
	}
	public static int findPower(int a, int b)
	{
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
		}
	return pow;
	}
	public static int countDigit(int n)
	{
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
	return count;
	}

	
}


