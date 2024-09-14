class using_thread extends Thread{
	public void run()
	{
		System.out.println("Thread running using_thread");
	}
}

class using_interface implements Runnable{
	public void run()
	{
		System.out.println("Thread running in interface");
	}
}

class q1{
	public static void main(String[] args)
	{
		using_thread th1 = new using_thread();
		th1.start();
		
		using_interface obj = new using_interface();
		Thread th2 = new Thread(obj);
		th2.start();
	}

}
