
public class Pyramid {
	public static void main(String[] args) {
		
		int limit=5;
		//right_number_pyramid(limit);
		System.out.println("-----------");
		
		//left_number_pyramid(limit);
		System.out.println("-----------");
		
		//number_pyramid(limit);
		System.out.println("-----------");
		
		inverted_right_number_pyramid(limit);
		System.out.println("-----------");
				
		
	}
	
	
	//NUMBERS pyramid
	public static void right_number_pyramid(int limit)
	{
		for(int i=1; i<=limit;i++)
		{
			for(int j=1;j<=i;j++)				
				System.out.print(j+" ");
			
			System.out.println();
		}
	}
//***************************************************
	public static void left_number_pyramid(int limit)
	{
		for(int i=1; i<=limit;i++)
		{
			for(int k=(limit-i);k>=1;k--)	//spaces
				System.out.print("  ");
			
			for(int j=i;j>=1;j--)
					System.out.print(j+" ");
			
			System.out.println();
		}
	}
//***************************************************
	public static void number_pyramid(int limit)
	{
		for(int i=1; i<=limit;i++)
		{
			for(int k=(limit-i);k>=1;k--)	//spaces
				System.out.print(" ");
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
//*************************************************************
	public static void inverted_right_number_pyramid(int limit)
	{
		for(int i=1; i<=limit;i++)
		{
			for(int j=1;j<=limit-i+1;j++)
				System.out.print(j+" ");
			
			System.out.println();
		}
	}
//*************************************************************
		
		
		
}
