import java.util.Scanner;
class add extends Thread{
	private int a,b;
	public add(int m,int n)
	{
		a=m;
		b=n;
	}
	public void run()
	{
		System.out.println("Addition of numbers is: "+(a+b));
	}
}

class mul extends Thread{
	private int a,b;
	public mul(int m,int n)
	{
		a=m;
		b=n;
	}
	public void run()
	{
		System.out.println("Multiplication of numbers is: "+(a*b));
	}
}

class div extends Thread{
	private int a,b;
	public div(int m,int n)
	{
		a=m;
		b=n;
	}
	public void run()
	{
		System.out.println("Division of numbers is: "+(a/b));
	}
}


class mod extends Thread{
	private int a,b;
	public mod(int m,int n)
	{
		a=m;
		b=n;
	}
	public void run()
	{
		System.out.println("Modulus of numbers is: "+(a%b));
	}
}



class q2{
	public static void main(String[] args)
	{
		int x, y;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter two numbers ");
		x=sc.nextInt();
		y=sc.nextInt();
		add a = new add(x,y);
		mul b = new mul(x,y);
		div c = new div(x,y);
		mod d = new mod(x,y);
		a.start();
		b.start();
		c.start();
		d.start();
	}
}
