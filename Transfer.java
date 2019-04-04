import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
class Transfer
{
	Console c=System.console();
	AccountDetails ob1=new AccountDetails();
	String accNo;
	String cardNo;
	String name;
	String date;
	String balance;
	String PIN;
	/*int cNo=Integer.parseInt(c.readLine("Enter CARD NUMBER:: "));
	int pin=Integer.parseInt(c.readLine("Enter PIN:: "));*/
	
	int accountNo,amount;
	void transferMoney(int cNo1,int pin1)throws Exception
	{
		accountNo=Integer.parseInt(c.readLine("\t\t\t\t\t\t\t\t\t\tENTER ACCOUNT NUMBER :: "));
		System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
		amount=Integer.parseInt(c.readLine("\t\t\t\t\t\t\t\t\t\tENTER AMOUNT :: "));
		//System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		String accNo,cardNo,name,date,balance,PIN1,accNo2,cardNo2,name2,date2,balance4,PIN3;
		int bal,newBal,bal1,newBal1;
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
					bal=Integer.parseInt(balance);
					newBal=bal-amount;
					String newBalance=Integer.toString(newBal);
					FileOutputStream fos=new FileOutputStream("Account"+ob1.text[i]+".txt");
					String accNo1=accNo+"\r\n";
					String cardNo1=cardNo+"\r\n";
					String name1=name+"\r\n";
					String date1=date+"\r\n";
					String balance1=newBalance+"\r\n";
					String PIN2=PIN1+"\r\n";
					byte [] b1=accNo1.getBytes();
					byte [] b2=cardNo1.getBytes();
					byte [] b3=name1.getBytes();
					byte [] b4=date1.getBytes();
					byte [] b5=balance1.getBytes();
					byte [] b6=PIN2.getBytes();
					fos.write(b1);
					fos.write(b2);
					fos.write(b3);
					fos.write(b4);
					fos.write(b5);
					fos.write(b6);
				}
			
			}
			if(accountNo==ob1.account_no[i])
			{
				FileInputStream fis1=new FileInputStream("Account"+ob1.text[i]+".txt");
				Scanner sc1=new Scanner(fis1);
				while(sc1.hasNext())
				{
					accNo2=sc1.nextLine();
					cardNo2=sc1.nextLine();
					name2=sc1.nextLine();
					date2=sc1.nextLine();
					balance4=sc1.nextLine();
					PIN3=sc1.nextLine();
					bal1=Integer.parseInt(balance4);
					newBal1=bal1+amount;
					String newBalance1=Integer.toString(newBal1);
					FileOutputStream fos1=new FileOutputStream("Account"+ob1.text[i]+".txt");
					String accNo3=accNo2+"\r\n";
					String cardNo3=cardNo2+"\r\n";
					String name3=name2+"\r\n";
					String date3=date2+"\r\n";
					String balance5=newBalance1+"\r\n";
					String PIN4=PIN3+"\r\n";	
					byte [] b11=accNo3.getBytes();
					byte [] b12=cardNo3.getBytes();
					byte [] b13=name3.getBytes();
					byte [] b14=date3.getBytes();
					byte [] b15=balance5.getBytes();
					byte [] b16=PIN4.getBytes();
					fos1.write(b11);
					fos1.write(b12);
					fos1.write(b13);
					fos1.write(b14);
					fos1.write(b15);
					fos1.write(b16);
				}
			}
			
		}
	}
	
	void transaction2(int cNo1,int pin1) throws Exception
	{
		for(int i=0;i<10;i++)
		{
			if(ob1.cardNo[i]==cNo1 && ob1.PIN[i]==pin1)
			{	
				//System.out.println("Your Ministatement");
				String trans=new String(Files.readAllBytes(Paths.get("C:/Users/nEW u/Desktop/Project/Transaction"+ob1.text[i]+".txt")));
				String trans3=trans+"\r\n";
				FileOutputStream fos2=new FileOutputStream("Transaction"+ob1.text[i]+".txt");
				Date d=new Date();
				String da=d.toString();
				String [] da1=da.split("[ ]");
				String da2=da1[1]+" "+da1[2];
				String trans1=da2+" - "+amount+" - "+"TRANSFER\r\n";
				byte [] b6=trans1.getBytes();
				byte [] b7=trans3.getBytes();
				fos2.write(b7);
				fos2.write(b6);
				FileInputStream fis2=new FileInputStream("Transaction"+ob1.text[i]+".txt");
				Scanner sc2=new Scanner(fis2);
				while(sc2.hasNext())
				{
					String trans2=sc2.nextLine();
					System.out.println("\t\t\t\t\t\t\t\t\t"+trans2+"\n");
				}
				//System.out.println("Done");
			System.out.println("\n");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n");
			//System.out.print("\n");
			System.out.println("\t\t\t\t\t\t\t\t\tTHANK YOU FOR USING SSN BANK ATM");
			System.out.print("\n");
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	
			}
		}
	}
}
/*class work4
{
	public static void main(String [] ar) throws Exception
	{
		Transfer ob9=new Transfer();
		ob9.transferMoney();
		ob9.transaction2();
	}
}*/