
public class Sum_the_digits {

	public static void main(String[] args) {
		
		int number = 55554;
		int sum=0;
		int remainder = 0;
		
		//METHOD 1
		while(number>=1)
		{
			remainder = number%10;
			sum = sum + remainder;
			number/=10;
		}
		System.out.println(sum);
		
		//METHOD2
		number = 55554;
		System.out.println(sum(number));
	}
	
	public static int sum(int num)
	{
		if(num>=1)
			return num%10 + sum(num/10);
		else return 0;
		
	}

}
