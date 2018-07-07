
public class Power_of_Number {

	public static void main(String[] args) {
		
		int number = 3;
		int power = 4;
		int sum=1;
		
		for(int i=1;i<=power;i++)
			sum = sum * number;

		System.out.println(sum);
		
		//METHOD 2 - recursive
		System.out.println(pow(number,power));
		
	}
	public static int pow(int number, int power)
	{
		if(power==0)
			return 1;
		return number * pow(number,power-1);
	}

}
