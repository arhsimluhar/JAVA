import java.util.Scanner;//imports the scanner to use it
class apples{
	public static void main (String args [])
	{	System.out.print("Enter your name: ");
		Scanner a = new Scanner(System.in);//declares a scanner variable to scan input 
		String b=a.nextLine();
		second obj=new second("Maria\n");//creates constructor call  
		second obj1=new second("Mia\n");//creates constructor call
		obj.Say();
		obj1.Say();
		obj.setName(b);//calls somu() function of the second class
		obj.Say();
	}
	    
	
}