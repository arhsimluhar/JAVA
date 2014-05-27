import java.util.Scanner;//imports the scanner to use it
class apples{
	public static void main (String args [])
	{
		Scanner a = new Scanner(System.in);//declares a scanner variable to scan input 
		double x,y,z;
		System.out.println("Enter the First Number:");
		x=a.nextDouble();
		System.out.println("Enter the Second Number:");
		y=a.nextDouble();
		z=x+y;
		System.out.println("Answer: " + z);
	}
	
}