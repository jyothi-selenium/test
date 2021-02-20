
public class SingleLevelInheritance extends nine{
	
	public void sand()
	{
		System.out.println("Child");
		
	}

	public static void main(String[] args)

	{
		SingleLevelInheritance single = new SingleLevelInheritance();
		
		single.sand();
		single.sample();
		System.out.println(single.i);
		

	}

}

class nine {

	
static int i=10;
	public static void sample() {
		System.out.println("Haapy");

	}

}
