class nested_exceptions
{
	public static void main(String[] args)
	{
		try
		{
			int arr[]={1,2,3};
			try
			{
				int z=arr[4];
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.toString());
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
		}
	}

}
