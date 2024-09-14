class exception_handling
{
	public static void main(String[] args)
	{
		try
		{
			int x=0,y=10;
			int c=y/x;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("This is the finally block");
		}
	}

}
