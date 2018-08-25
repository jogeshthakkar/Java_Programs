
public class Prime_Number_generation 
{
	public static void main(String[] args) 
	{
		//Prime numbers between one to hundred
		
		boolean flag = true;
		
		System.out.print(2 + " ");
		
		for(int i=3;i<=100;i++) //iterate through the range
		{
			flag = true;
			for(int j=2;j<=i/2;j++)	//divide by all number less than half of itself
			{
				if(i%j==0)
					{
						flag = false;
						break;
					}
				
			}
			if(flag)
				System.out.print(i+" ");
		}
	}
}
	
	
	   

