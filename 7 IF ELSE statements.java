import java.util.Scanner;//imports the scanner to use it
class apples{
	public static void main (String args [])
	{
		Scanner a = new Scanner(System.in);//declares a scanner variable to scan input 
		int x;
		x=a.nextInt();
		if(x%2==0)
			{
			System.out.print("Even Number.");
		    
			}
		else
			System.out.print("Odd Number.");
		//rest all the if else concept is same as c++ so its left here
	}
	    
	
}