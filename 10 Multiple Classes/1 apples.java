import java.util.Scanner;//imports the scanner to use it
class apples{
	public static void main (String args [])
	{
		Scanner a = new Scanner(System.in);//declares a scanner variable to scan input 
		int x;
		x=a.nextInt();
		int fact=1;
		int y=x;
		while(x>0)//while loop implemented in the same way as in c++
		{
			fact=fact*x;
			--x;
		}
		System.out.println("factorial of " + y + " is " + fact);
		second obj=new second();//creates object of second class  
		obj.somu();//calls somu() function of the second class
	}
	    
	
}