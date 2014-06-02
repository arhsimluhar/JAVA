import java.util.Random;//imports the to generate random nnumbers
class apples{
	public static void main (String args [])
	{
		
		Random a =new Random();// 'a' is an object to random class
		for(int i=0;i<10;i++)
		{
			int b=1+a.nextInt(6);//generates random number between 0-5
			System.out.println(b+" ");
		}
	}   
	
}