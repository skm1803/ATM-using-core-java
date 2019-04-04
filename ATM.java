import java.io.*;
import java.util.*;
class ATM
{
	int notes_2000_1,notes_100_1,notes_500_1,notes_50_1,notes_2000,notes_500,notes_100,notes_50;
	int x,z,a,c,b,y,d,e;
	int amount=100;
	void atm()throws Exception
	{
		FileInputStream fis=new FileInputStream("ATM.txt");
		Scanner sc=new Scanner(fis);
		while(sc.hasNext())
		{
			//System.out.println("hello");
			String note_2000=sc.nextLine();
			System.out.println(note_2000);
			String note_500=sc.nextLine();
			System.out.println(note_500);
			String note_100=sc.nextLine();
			System.out.println(note_100);
			String note_50=sc.nextLine();
			System.out.println(note_50);
			notes_2000=Integer.parseInt(note_2000);		
			notes_500=Integer.parseInt(note_500);
			notes_100=Integer.parseInt(note_100);
			notes_50=Integer.parseInt(note_50);
			
			if(amount>=2000)
			{
				System.out.println("hello1");
				x=amount/2000;
				z=amount%2000;
				
				if(z>=500)
				{
					int a=z/500;
					int c=z%500;
					if(c>=100)
					{
						int b=c/100;
						int y=c%100;
						if(y>=50)
						{
							int d=y/50;
							int e=y%50;
							notes_50_1=notes_50-d;
						}
						else
						{
							notes_50_1=notes_50;	
						}
						notes_100_1=notes_100-b;
					}
					else
					{
						notes_50_1=notes_50;
						notes_100_1=notes_100;	
					}
					notes_500_1=notes_500-a;
				}
			}
			else if(amount<2000 && amount>=500)
			{
				System.out.println("hello2");
				int a=amount/500;
				int c=amount%500;
				if(c>=100)
				{
					int b=c/100;
					int y=c%100;
					if(y>=50)
					{
						int d=y/50;
						int e=y%50;
						notes_50_1=notes_50-d;
					}
					else
					{
						notes_50_1=notes_50;	
					}
					notes_100_1=notes_100-b;
				}
				else
				{
					notes_50_1=notes_50;
					notes_100_1=notes_100;	
				}
				notes_500_1=notes_500-a;
				notes_2000_1=notes_2000;
			}
			
			
			else if(amount<500 && amount>=100)
			{
				System.out.println("hello3");
				int b=amount/100;
				int y=amount%100;
				if(y>=50)
				{
					int d=y/50;
					int e=y%50;
					notes_50_1=notes_50-d;
				}
				else
				{
					notes_50_1=notes_50;	
				}
				System.out.println("Done");
				notes_100_1=notes_100-b;
				notes_500_1=notes_500;
				notes_2000_1=notes_2000;
				System.out.println("done1");
			}
			
			else
			{	System.out.println("hello4");
				System.out.println("Less than 50 not accepted!");
			}
			
			FileOutputStream fos=new FileOutputStream("ATM.txt");
			System.out.println(notes_2000_1);
			String notes1_2000=Integer.toString(notes_2000_1);
			System.out.println(notes_500_1);
			String notes1_500=Integer.toString(notes_500_1);
			System.out.println(notes_100_1);
			String notes1_100=Integer.toString(notes_100_1);
			System.out.println(notes_50_1);
			String notes1_50=Integer.toString(notes_50_1);
			String note2000=notes1_2000+"\r\n";
			String note500=notes1_500+"\r\n";
			String note100=notes1_100+"\r\n";
			String note50=notes1_50+"\r\n";
			byte [] b10=note2000.getBytes();
			byte [] b11=note500.getBytes();
			byte [] b12=note100.getBytes();
			byte [] b13=note50.getBytes();
			fos.write(b10);
			fos.write(b11);
			fos.write(b12);
			fos.write(b13);	
		}
	}
}	
class work5
{
	public static void main(String [] ar)throws Exception
	{
		ATM ob11=new ATM();
		ob11.atm();
	}
}
		