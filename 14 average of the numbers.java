import java.util.Scanner;//imports the scanner to use it
class apples{
	public static void main (String args [])
	{
		System.out.print("Enter the number of arguements:\n");
		Scanner o=new Scanner(System.in);
		int n=o.nextInt();
		int counter=0;
		int total=0;
		while(counter<n)
		{
			int grade=o.nextInt();
			total+=grade;
			counter+=1;
			
		}
		System.out.println("Average is :" +total/counter);
		
		
	}
	    
	
}