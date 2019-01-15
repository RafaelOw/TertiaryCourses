import java.util.Arrays;
import java.util.Scanner;

public class SomeMethods {
	
	public static void Average(int num1, int num2, int num3)
	{
		double avg = (num1+num2+num3)/3;
		System.out.println("Average of those is " + avg);
	}
	public static int Fibonacci(int num)
	{
		if (num ==0)
		{
			return 0;
		}
		else if (num ==1)
		{
			return 1;
		}
		else
		{
			return Fibonacci(num-1) + Fibonacci(num-2);
		}
		
	}

	public static int Fibo(int ...numbers)
	{
		int sum=0;
		for (int i=0;i<numbers.length;i++) {
			sum = sum+numbers[i];
		}
		return sum;
	}
	
	public static int[] MinMax(int ...numbers)
	{
		int minimum = numbers[0];
		int maximum = numbers[0];
		for (int i=0;i<numbers.length;i++)
		{
			if(minimum > numbers[i])
			{
				minimum = numbers[i];
			}
			if(maximum < numbers[i])
			{
				maximum = numbers[i];
			}
		}
		int[] val = new int[2];
		val[0] = minimum;
		val[1] = maximum;
		return val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test Average method
//		Scanner numinput = new Scanner(System.in);
//		System.out.print("Provide 3 numbers \n");
//		int num1 = numinput.nextInt();
//		int num2 = numinput.nextInt();
//		int num3 = numinput.nextInt();
//		
//		Average(num1,num2,num3);
		
		//test Fibonacci method
//		for (int i=1; i<10 ; i++)
//		{
//		System.out.println(Fibonacci(i));
//		}
		
		//Method test
		//System.out.println(MinVal(9,10,2,5,7));
		
		int[] arr = MinMax(4,10,7,9,5);
		System.out.println(arr[0]+" " +arr[1]);
		
	}

}
