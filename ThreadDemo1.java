import java.util.*;
class ThreadDemo1
{
	void demo1() throws Exception
	{
		System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t\tTRANSACTION IN PROCESS....... ");
		System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		CountDown1 t1=new CountDown1();
		t1.start();
		t1.join();
		System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
		System.out.print("\n\t\t\t\t\t\t\t\t\tCOLLECT YOUR CASH!!!\n");
		//System.out.println("\n");
		//System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//System.out.println("\n");
	}
}
class CountDown1 extends Thread
{
	public void run()
	{
		for(int i=9;i>=1;i--)
		{
			System.out.print("\b"+"                            "+i);
			try
			{
				  Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}