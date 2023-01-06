package thread;

public class ThreadDemo extends Thread {
public ThreadDemo(String name)
{
	super(name);
}
	public void run()
	{
		System.out.println("Thread is running: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1=new ThreadDemo("1st Thread");
		ThreadDemo t2=new ThreadDemo("2nd Thread");
		ThreadDemo t3=new ThreadDemo("3rd Thread");
		t1.start();
		t2.start();
		t3.start();

	}

}
