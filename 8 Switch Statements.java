import java.util.Scanner;//imports the scanner to use it
class apples{
	public static void main (String args [])
	{
		Scanner a = new Scanner(System.in);//declares a scanner variable to scan input 
		int x;
		x=a.nextInt();
		switch(x) //syntax as C++ Implementation
			{
		
		case 1:
			System.out.println("YOU can Crawl");
			break;
		default:
			System.out.println("Default Case");
			
			}
	}
	    
	
}