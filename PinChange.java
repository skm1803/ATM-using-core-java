import java.io.*;
import java.util.*;
class PinChange
{
	Console c=System.console();
	AccountDetails ob1=new AccountDetails();
	
	String accNo;
	String cardNo;
	String name;
	String date;
	String balance;
	String PIN;
	void pinChange()throws Exception
	{
		String accNo,cardNo,name,date,balance,PIN1;
		String text,cardNo2,Pin1;
		//int cNo=Integer.parseInt(c.readLine("Enter CARD NUMBER:: "));
		//int pin=Integer.parseInt(c.readLine("Enter PIN:: "));
		
		int choice=Integer.parseInt(c.readLine("Do You Want to change PIN(1-y/0-n)?:: "));
		if(choice==1)
		{
			int newPin=Integer.parseInt(c.readLine("Enter NEW PIN:: "));
			int confirmPin=Integer.parseInt(c.readLine("Confirm NEW PIN:: "));
			if(newPin==confirmPin)
			{
				
				for(int i=0;i<10;i++)
				{
					
						FileInputStream fis=new FileInputStream("Account"+ob1.text[i]+".txt");
						Scanner sc=new Scanner(fis);
						while(sc.hasNext())
						{
							accNo=sc.nextLine();
							cardNo=sc.nextLine();
							name=sc.nextLine();
							date=sc.nextLine();
							balance=sc.nextLine();
							PIN1=sc.nextLine();
							FileOutputStream fos=new FileOutputStream("Account"+ob1.text[i]+".txt");
							String accNo1=accNo+"\r\n";
							String cardNo1=cardNo+"\r\n";
							String name1=name+"\r\n";
							String date1=date+"\r\n";
							String balance1=balance+"\r\n";	
							byte [] b1=accNo1.getBytes();
							byte [] b2=cardNo1.getBytes();
							byte [] b3=name1.getBytes();
							byte [] b4=date1.getBytes();
							byte [] b5=balance1.getBytes();
							String PIN3=Integer.toString(newPin);
							byte [] b=PIN3.getBytes();
							fos.write(b1);
							fos.write(b2);
							fos.write(b3);
							fos.write(b4);
							fos.write(b5);
							fos.write(b);
							System.out.println("PIN changed!");
							
						}
						/*FileInputStream fis10=new FileInputStream("PIN.txt");
						Scanner sc15=new Scanner(fis10);
						while(sc15.hasNext())
						{
							String d1=sc15.nextLine();
							String d2=sc15.nextLine();
							String d3=sc15.nextLine();
							String d4=sc15.nextLine();
							String d5=sc15.nextLine();
							String d6=sc15.nextLine();
							String d7=sc15.nextLine();
							String d8=sc15.nextLine();
							String d9=sc15.nextLine();
							String d10=sc15.nextLine();
							int q1=Integer.parseInt(b1);
							int q2=Integer.parseInt(b2);
							int q3=Integer.parseInt(b3);
							int q4=Integer.parseInt(b4);
							int q5=Integer.parseInt(b5);
							int q6=Integer.parseInt(b6);
							int q7=Integer.parseInt(b7);
							int q8=Integer.parseInt(b8);
							int q9=Integer.parseInt(b9);
							int q10=Integer.parseInt(b10);
							int [] PIN={q1,q2,q3,q4,q5,q6,q7,q8,q9,q10};
							FileOutputStream fos10=new FileOutputStream("PIN.txt");
							int x=PIN[0];
							int m=5;
							int l=0;
							int r=10;
							for(int i=0;i<10;i++)
							{
								if(PIN[i]==pin)
								{
									PIN[i]=newPin;
									x=PIN[i];
									String si=di+"\r\n";
									String k=Integer.toString(x);
									String k1=k+"\r\n";
									byte [] bi=si.getBytes();
									byte [] k2=k1.getBytes();
									fos10.write(k2);
									fos10.write(bi);
								}
							}
							
						}*/
					
				}
			}
		
		}
	}
}
/*class work
{
	public static void main(String ar[])throws Exception
	{
		PinChange ob=new PinChange();
		ob.pinChange();
	}
}*/
