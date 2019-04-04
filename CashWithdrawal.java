import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;	
class CashWithdrawal
{
	Console c=System.console();
	AccountDetails ob1=new AccountDetails();
	
	String accNo;
	String cardNo;
	String name;
	String date;
	String balance;
	String PIN1;
	String bal3;
	//int notes_2000_1,notes_100_1,notes_500_1,notes_50_1,;
	//int x,z,a,c,b,y,d,e;
	//int cNo=Integer.parseInt(c.readLine("Enter CARD NUMBER:: "));
	//int pin=Integer.parseInt(c.readLine("Enter PIN:: "));
	ThreadDemo1 ob99=new ThreadDemo1();
	int amount=Integer.parseInt(c.readLine("\t\t\t\t\t\t\t\t\t\tENTER AMOUNT:: "));
	
	int notes_2000_1,notes_100_1,notes_500_1,notes_50_1,notes_2000,notes_500,notes_100,notes_50;
	int x,z,a,c1,b,y1,d,e;
	void cashWithdrawal(int cNo1,int pin1)throws Exception
	{
		
		if(amount>=50)
		{
			ob99.demo1();
			System.out.println("\n");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("\t\t\t\t\t\t\t\t\tCHECK FOR CURRENT BALANCE");
		
			System.out.println("\n");
			System.out.println("\n");
			System.out.print("\t\t\t\t1.YES");
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t2.NO");
			System.out.println("\n");
			int ch=Integer.parseInt(c.readLine("\t\t\t\t\t\t\t\t\t\t\t" ));
			System.out.println("\n");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			if(ch==1)
			{
				for(int i=0;i<10;i++)
				{			
					if(ob1.cardNo[i]==cNo1 && ob1.PIN[i]==pin1)
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
							System.out.println("\n");
							System.out.println("\t\t\t\t\t\t\t\tPREVIOUS BALANCE:: "+balance);
							System.out.println("\n");
							System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
							
							int bal1=Integer.parseInt(balance);
							
								
								int bal2=bal1-amount;
								bal3=Integer.toString(bal2);
								
								FileOutputStream fos=new FileOutputStream("Account"+ob1.text[i]+".txt");
								String accNo1=accNo+"\r\n";
								String cardNo1=cardNo+"\r\n";
								String name1=name+"\r\n";
								String date1=date+"\r\n";
								String balance1=bal3+"\r\n";
								String PIN2=PIN1+"\r\n";	
								byte [] b1=accNo1.getBytes();
								byte [] b2=cardNo1.getBytes();
								byte [] b3=name1.getBytes();
								byte [] b4=date1.getBytes();
								byte [] b5=balance1.getBytes();
								byte [] b=PIN2.getBytes();
								fos.write(b1);
								fos.write(b2);
								fos.write(b3);
								fos.write(b4);
								fos.write(b5);
								fos.write(b);
								System.out.println("\n");
								System.out.println("\t\t\t\t\t\t\t\tCURRENT BALANCE:: "+bal2);
								System.out.println("\n");
								System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
								System.out.print("\n");
								atm();
								transaction1(cNo1,pin1);
								
						}
					}
				}
				
			}
			else
			{
				//System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("\t\t\t\t\t\t\t\t\tTHANK YOU FOR USING SSN BANK ATM");
					System.out.print("\n");
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,"\t OOPS!!! \n AMOUNT LESS THAN 50 NOT ACCEPTED!","warning",JOptionPane.ERROR_MESSAGE);
				
		}
	}
		
	
	void atm()throws Exception
	{
		FileInputStream fis=new FileInputStream("ATM.txt");
		Scanner sc5=new Scanner(fis);
		while(sc5.hasNext())
		{
			//System.out.println("hello");
			String note_2000=sc5.nextLine();
			//System.out.println(note_2000);
			String note_500=sc5.nextLine();
			//System.out.println(note_500);
			String note_100=sc5.nextLine();
			//System.out.println(note_100);
			String note_50=sc5.nextLine();
			//System.out.println(note_50);
			notes_2000=Integer.parseInt(note_2000);		
			notes_500=Integer.parseInt(note_500);
			notes_100=Integer.parseInt(note_100);
			notes_50=Integer.parseInt(note_50);
			
			if(amount>=2000)
			{
				//System.out.println("hello1");
				x=amount/2000;
				z=amount%2000;
				
				if(z>=500)
				{
					int a=z/500;
					int c1=z%500;
					if(c1>=100)
					{
						int b=c1/100;
						int y1=c1%100;
						if(y1>=50)
						{
							int d=y1/50;
							int e=y1%50;
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
				notes_2000_1=notes_2000-x;
				notes_500_1=notes_500;
				notes_100_1=notes_100;
				notes_50_1=notes_50;
			}
			else if(amount<2000 && amount>=500)
			{
				//System.out.println("hello2");
				int a=amount/500;
				int c1=amount%500;
				if(c1>=100)
				{
					int b=c1/100;
					int y=c1%100;
					if(y1>=50)
					{
						int d=y1/50;
						int e=y1%50;
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
				//System.out.println("hello3");
				int b=amount/100;
				int y1=amount%100;
				if(y1>=50)
				{
					int d=y1/50;
					int e=y1%50;
					notes_50_1=notes_50-d;
				}
				else
				{
					notes_50_1=notes_50;	
				}
				//System.out.println("Done");
				notes_100_1=notes_100-b;
				notes_500_1=notes_500;
				notes_2000_1=notes_2000;
				//System.out.println("done1");
			}
			else if(amount<100 && amount>=50)
			{
				if(amount>=50)
				{
					int d=amount/50;
					int e=amount%50;
					notes_50_1=notes_50-d;
				}
				else
				{
					notes_50_1=notes_50;
					notes_100_1=notes_100;
					notes_500_1=notes_500;
					notes_2000_1=notes_2000;	
				}		
			}
			else
			{	//System.out.println("hello4");
				//System.out.println("Less than 50 not accepted!");
				notes_50_1=notes_50;
				notes_100_1=notes_100;
				notes_500_1=notes_500;
				notes_2000_1=notes_2000;
			}
			
			FileOutputStream fos=new FileOutputStream("ATM.txt");
			//System.out.println(notes_2000_1);
			String notes1_2000=Integer.toString(notes_2000_1);
			//System.out.println(notes_500_1);
			String notes1_500=Integer.toString(notes_500_1);
			//System.out.println(notes_100_1);
			String notes1_100=Integer.toString(notes_100_1);
			//System.out.println(notes_50_1);
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
	void transaction1(int cNo1,int pin1) throws Exception
	{
		for(int i=0;i<10;i++)
		{
			if(ob1.cardNo[i]==cNo1 && ob1.PIN[i]==pin1)
			{	
				if(amount>=50)
				{
					String trans=new String(Files.readAllBytes(Paths.get("C:/Users/nEW u/Desktop/Project/Transaction"+ob1.text[i]+".txt")));
					String trans3=trans+"\r\n";
					FileOutputStream fos1=new FileOutputStream("Transaction"+ob1.text[i]+".txt");
					Date d=new Date();
					String da=d.toString();
					String [] da1=da.split("[ ]");
					String da2=da1[1]+" "+da1[2];
					String trans1=da2+" - "+amount+" - "+"WITHDRAWAL\r\n";
					byte [] b6=trans1.getBytes();
					byte [] b7=trans3.getBytes();
					fos1.write(b7);
					fos1.write(b6);
					FileInputStream fis2=new FileInputStream("Transaction"+ob1.text[i]+".txt");
					Scanner sc2=new Scanner(fis2);
					while(sc2.hasNext())
					{
						String trans2=sc2.nextLine();
						System.out.println("\t\t\t\t\t\t\t"+trans2+"\n");
					}
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("\t\t\t\t\t\t\t\t\tTHANK YOU FOR USING SSN BANK ATM");
					System.out.print("\n");
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
				}
				else
				{
					break;
				}
			}
		}
	}
}

/*class work2
{
	public static void main(String [] ar)throws Exception
	{
		CashWithdrawal ob4=new CashWithdrawal();
		ob4.cashWithdrawal();
		ob4.atm();
		ob4.transaction1();
	}
}
*/
							