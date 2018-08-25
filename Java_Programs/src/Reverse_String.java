
public class Reverse_String 
{
	public static void main(String[] args) 
	{	
		String s1="Jogesh";
		int length = s1.length();
		
		//using charAt
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		
		//using StringBuffer
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());
	}

}
