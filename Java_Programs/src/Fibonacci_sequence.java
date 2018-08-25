
public class Fibonacci_sequence {

	public static void main(String[] args) 
	{
		// 1,\;1,\;2,\;3,\;5,\;8,\;13,\;21,\;34,\;55,\;89,\;144
		
		//METHOD 1
		int x1 = 0;
		int x2 =1;
		int x3=0;
		
		System.out.print(x2+ " ");
		
		for(int i=2;i<=10;i++)
		{
			x3=x1+x2;
			System.out.print(x3 + " ");
			x1=x2;
			x2=x3;
		}
		System.out.println();
		
		//METHOD 2- to find number at index
		
		System.out.println(fib(10));
	}
	
	
	public static int fib(int number)
	{
		if(number == 1 || number == 2)
			return 1; 
		return fib(number-1) + fib(number -2); //tail recursion
	}

}
