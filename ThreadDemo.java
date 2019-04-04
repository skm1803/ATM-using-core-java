
import java.util.*;
class ThreadDemo
{
	public static void main(String [] ar) throws Exception
	{
		System.out.println("TRANSACTION IN PROCESS.......");
		CountDown1 t1=new CountDown1();
		
		
		t1.start();
		
		t1.join();
		System.out.println("COLLECT YOUR CASH");
	}
}
class CountDown1 extends Thread
{
	public void run()
	{
		
		
			for(int i=9;i>=0;i--)
			{
				System.out.println("\b"+i);
				try
				{
					Thread.sleep(1000);
				}
				catch (Exception e)
				{
				}
				//System.out.println("\r");
			}
		
	}
}
