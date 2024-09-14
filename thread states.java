class using_thread extends Thread{
	public void run()
	{
		System.out.println("Thread going to sleep");
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println("5 second sleep ");
		}
		System.out.println("Thread is back");
	}
}


class q3{
	public static void main(String[] args)
	{
		using_thread th1 = new using_thread();
		th1.start();
		System.out.println("Is thread alive? "+th1.isAlive());
		System.out.println("priority of this thread is "+th1.getPriority());
		System.out.println("name of this thread is "+th1.getName());
	}

}
