import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
class Machine extends Thread
{
	public static void main(String [] ar)throws Exception
	{
		Console c50=System.console();
		AccountDetails ob70=new AccountDetails();
		int cNo,pin;
		Demo2 ob60=new Demo2();
		ob60.page_1();
		
		Thread.sleep(2000);
		for(int i=0;i>15;i++)
		{
			System.out.println("\n ");
		}	
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t\tWELCOME TO SSN BANK ATM\t\t\t\t\t");
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 1; i <= 20; i++) 
		{
			for (int j = 1; j <= 59; j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n");	
		int w=Integer.parseInt(c50.readLine("\t\t\t\t\t\t\t\tENTER ANY NUMBER AS SHOWN :: "));
		if(w>1 && w<60)
		{
			System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n");
		cNo=Integer.parseInt(c50.readLine("\t\t\t\t\t\t\t\tENTER CARD NUMBER :: "));
		System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("\n");
		//int pin=Integer.parseInt(c50.readLine("\t\t\t\t\t\t\t\tEnter PIN:: "));
		char [] passwordArray= c50.readPassword("\t\t\t\t\t\t\t\tEnter PIN:: ");
		String h=new String(passwordArray);
		pin=Integer.parseInt(h);
		//c50.printf("Password entered was:%d\n",pin);

		System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		boolean flag=false;
		for(int i=0;i<10;i++)
		{
			//System.out.println("Heloo");
			if(ob70.cardNo[i]==cNo && ob70.PIN[i]==pin)
			{	//System.out.println("Hello");
				System.out.println("\n");
				System.out.println("\n");
				System.out.print("\t\t\t\t\t1.MINISTATEMENT\t\t\t\t\t\t\t\t");
				System.out.println("2.CASH WITHDRAWAL");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.print("\t\t\t\t\t3.TRANSFER CASH\t\t\t\t\t\t\t\t");
				System.out.println("4.EXIT");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("\n");
				int ch10=Integer.parseInt(c50.readLine("\t\t\t\t\t\t\t\t\t\tENTER YOUR CHOICE:"   ));
				System.out.println("\n");
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				switch(ch10)
				{
					case 1:
						MiniStatement ob51=new MiniStatement();
						ob51.ministatement(cNo,pin);
						ob51.transaction(cNo,pin);
						break;
					case 2:
						CashWithdrawal ob53=new CashWithdrawal();
						ob53.cashWithdrawal(cNo,pin);
						break;
					case 3:
						Transfer ob54=new Transfer();
						ob54.transferMoney(cNo,pin);
						ob54.transaction2(cNo,pin);
						break;
					case 4:
						System.out.println("\t\t\t\t\t\t\t\t\t\tEXIT!!!");
						
						System.out.println("\n");
						System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						break;
					default:System.out.println("\t\t\t\t\t\t\t\t\t\tWRONG CHOICE!!!");
				}
				flag = true;
				break;
			}	
			
		}
		if(flag==false)
			{
				JOptionPane.showMessageDialog(null,"\t OOPS!!! \n INVALID PIN","alert",JOptionPane.ERROR_MESSAGE);
						
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,"\t OOPS!!! \n INVALID NUMBER","alert",JOptionPane.ERROR_MESSAGE);
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n");
		}		
	}
}
			
	 
