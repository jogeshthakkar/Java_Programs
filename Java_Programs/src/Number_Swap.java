
public class Number_Swap {
	 public static void main(String[] args) {
		    int x = 10;
		  int y = 20;
		  
		  System.out.println("Before swapping x = " + x + " and y = " + y);
		  x = x + y;	//10+20 = 30
		  y = x - y;	//30-20=10
		  x = x - y;	//30-10

		  System.out.println("After swapping x = " + x + " and y = " + y);
		 }

}
