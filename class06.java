package hw06;
class Add implements Runnable
{
   private int n;
   private int sum=0;
   public Add(int a)
   {
      n=a;
   }
   public void run()
   {
      for(int i=1;i<=n;i++)
      {
         for(int j=0;j<100000000;j++);
         sum+=i;
      }
      System.out.println("1+2+...+"+n+"="+sum);
   }
}
public class class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a1=new Add(5);
	    Add a2=new Add(10);
	    Thread b1=new Thread(a1);
	    Thread b2=new Thread(a2);
	    b1.start();
	    b2.start();
	}

}
