
public class countofcharcters {

	public static void main(String[] args) 
	
	{
		
		String s1= "Happy New Year";
		
		int count =1;
		
		for(int i=1;i<s1.length()-1;i++)
		{
		
		if((s1.charAt(i)==' ') && (s1.charAt(i+1)!=' '))
      {
	
	count++;
       }
		
	
		
}
		
		System.out.println("number of words"+ count);
}
}