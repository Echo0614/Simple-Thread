//this is the main class to run the thread

public class Main
{
	public static void main(String[]args)
	{
		Thread t1 = new Thread(new LearningThread("Echo1"));
		Thread t2 = new Thread(new LearningThread("Echo2"));
		Thread t3 = new Thread(new LearningThread("Echo3"));
		Thread t4 = new Thread(new LearningThread("Echo4"));
		Thread t5 = new Thread(new LearningThread("Echo5"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
