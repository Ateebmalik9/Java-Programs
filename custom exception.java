 class InvalidAge extends Exception
 {
	public InvalidAge(String str)
	{
		super(str);
	}
 }
 class custom_exception
 {
	public static void main(String[] args)
	{
		try
		{
			throw new InvalidAge("Age is less than 18");
		}
		catch(InvalidAge e)
		{
			System.out.println(e.toString());
		}
		
	}
 
 }
