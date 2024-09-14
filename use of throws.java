class use_of_throws
{
	static int divide(int m, int n) throws ArithmeticException
	{
		return m/n;
	}
	public static void main(String[] args)
	{
		try
		{
			int x=10,y=0;
			int c=divide(x,y);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
	}

}
