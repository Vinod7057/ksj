class Test  implements Runnable 
{
  public void run()
	{
	  try{
	  for(int i=0; i<=10; i++)
		{
	      Thread.sleep(2000); //2 se
		  System.out.println("in thread 1");
		}
	  }
	  catch(InterruptedException i)
		{
		  i.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		Test t1= new Test();
		Thread t = new Thread(t1);
         t.start();
		  for(int i=0; i<=10; i++)
		     System.out.println("in main");
	}
}
