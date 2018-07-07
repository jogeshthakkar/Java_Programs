
public class Factorial {

	public static void main(String[] args) {
		
		int number = 5;
		int sum = 1;
		//5*4*3*2*1 =120
		
		//METHOD 1
		for(int i=number;i>=1;i--)
			sum = sum * i;
			
		System.out.println(sum);
		
		//METHOD 2
		System.out.println(fact(number));
	}
	public static int fact(int num)
	{
		if(num==0 || num==1)
			return 1;
		else
			return num*fact(num-1);
		
		//return(num==0||num==1)?1:(num*fact(num-1))
	}

}
