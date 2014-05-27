public class second {
	private String girlName; //private data member not accessible by apples.java
	public void setName(String name)
		{
			girlName=name;
		}
	public String Name()
		{
			return	girlName;
		}
	public void Say()
		{
			System.out.printf("Your name is : %s",Name());
		}
}
