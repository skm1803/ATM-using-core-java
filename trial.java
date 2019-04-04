class trial
{
	public static void main(String [] ar)
	{
		int amount=10600;
		if(amount>=2000)
		{
			int x=amount/2000;
			int z=amount%2000;
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
						System.out.println("50:"+d);
					}System.out.println("100:"+b);
				}System.out.println("500:"+a);
			}System.out.println("2000:"+x);
		}
	}
}	