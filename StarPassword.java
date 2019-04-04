class Test
{
 public static void main(String [] ar)throws Exception
 {
   Thread t = new Thread(){public void run(){
    while(true){System.out.print("\b*");}}};
   
   t.start();
   String s = "";
   System.out.print("Enter Password : ");
   while(true)
   {
      int i = System.in.read();
      if(i==13){t.stop();break;}
      s += (char)i;
   }
   System.out.println("\b"+s);   
 }
}
