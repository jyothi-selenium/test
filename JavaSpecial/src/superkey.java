
public class superkey {

	public static void main(String[] args) {
		
		System.out.println("done");
		
		Ba obj = new Ba(5
				
				);
		
	

	}

}

class ABC{

	public ABC() {

		System.out.println("Const in A");

	}

	public ABC(int i) {

		System.out.println("Const in A with params");

	}

}

class Ba extends ABC
{

	public Ba() 
	{

		System.out.println("Const in B");

	}

	public Ba(int i) {

		
		super(5);
		System.out.println("Const in B with params");

	}

}