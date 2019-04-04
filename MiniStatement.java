import java.io.*;
import java.util.*;
class MiniStatement
{
	Console c=System.console();
	AccountDetails ob1=new AccountDetails();
	String accNo;
	String cardNo;
	String name;
	String date;
	String balance;
	String PIN1;
	//int cNo=Integer.parseInt(c.readLine("Enter CARD NUMBER:: "));
	//int pin=Integer.parseInt(c.readLine("Enter PIN:: "));
	
	void ministatement(int cNo1,int pin1)throws Exception
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
					System.out.println("\t\t\t\t\t\t\t\t\t\tMINI-STATEMENT");
					System.out.println("\n");
					System.out.print("\t\t\t\tACCOUNT NUMBER::\t\t\t\t\t\t\t\t\t"+accNo);
					System.out.print("\n");
					System.out.print("\t\t\t\tCARD NUMBER:: \t\t\t\t\t\t\t\t\t\t"+cardNo);
					System.out.print("\n");
					System.out.print("\t\t\t\tCARD HOLDER NAME:: \t\t\t\t\t\t\t\t\t"+name);
					System.out.print("\n");
					System.out.print("\t\t\t\tEXPIRY DATE::\t\t\t\t\t\t\t\t\t\t "+date);
					System.out.print("\n");
					System.out.print("\t\t\t\tBALANCE:: \t\t\t\t\t\t\t\t\t\t"+balance);
					
					System.out.print("\n");
					System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
					
				}
			}
		}
	}
	void transaction(int cNo1,int pin1)throws Exception
	{
		for(int i=0;i<10;i++)
		{
			if(ob1.cardNo[i]==cNo1 && ob1.PIN[i]==pin1)
			{		
				FileInputStream fis1=new FileInputStream("Transaction"+ob1.text[i]+".txt");
				Scanner sc1=new Scanner(fis1);
				while(sc1.hasNext())
				{	
					String trans=sc1.nextLine();
					System.out.println("\t\t\t\t\t\t\t\t\t"+ trans+"\n");
					
				}
			}	
		}
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.print("\n");
	System.out.println("\t\t\t\t\t\t\t\t\tTHANK YOU FOR USING SSN BANK ATM");
	System.out.print("\n");
	System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
	}
}
/*class work3
{
	public static void main(String [] ar)throws Exception
	{
		MiniStatement ob5=new MiniStatement();
		ob5.ministatement();
		ob5.transaction();
	}
}*/