package thread;

public class ThreadDemoEx extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(400);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(Thread.currentThread().getName());
			
		}
	}

	public static void main(String[] args) {
		
		ThreadDemoEx t1=new ThreadDemoEx();
		ThreadDemoEx t2=new ThreadDemoEx();
		ThreadDemoEx t3=new ThreadDemoEx();
		ThreadDemoEx t4=new ThreadDemoEx();
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t4.setName("Thread-4");
		t1.setPriority(MIN_PRIORITY);//1
		t2.setPriority(NORM_PRIORITY);//5
		t3.setPriority(MAX_PRIORITY);//10
		t4.setPriority(4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
