package hw04;
class CTest extends Thread
{
   private String id;
   public CTest(String str)
   {
      id=str;
   }
   public void run()
   {
      for(int i=1;i<=5;i++)
      {
         for(int j=0;j<100000000;j++);
         System.out.println(id+" "+i);
      }
   }
}
public class class04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest c1=new CTest("Hello");
		CTest morning=new CTest("Good morning");
	    CTest c2=new CTest("Good bye");
	    c1.start();
	    morning.start();
	    c2.start();

	}

}
