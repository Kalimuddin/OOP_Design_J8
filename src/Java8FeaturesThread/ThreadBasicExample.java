package Java8FeaturesThread;
// very simple program for multithreading in java :
class ThreadA extends Thread{
	public void run() {
		System.out.println("ThreadA " + Thread.currentThread());
		for(int i=0; i<=20; i++) {
			System.out.println("ThreadA class with i " + i);
		}
	}
}

class ThreadB extends Thread{
	public void run() {
		System.out.println("ThreadB " + Thread.currentThread());
		for(int i=0; i<=20; i++) {
			System.out.println("ThreadB class with i " + i);
		}
	}
}

// Another way to implement :
class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("ThreadRunnable " + Thread.currentThread());
		for(int i=0; i<=20; i++) {
			System.out.println("ThreadRunnable class with i " + i);
		}
	}
	
}

public class ThreadBasicExample {
	public static void main(String args[]) {
		System.out.println("ThreadA " + Thread.currentThread());
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		// For first completing threadA then other thread will perform :
//		try {
//			threadA.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		threadA.start();
		threadB.start();
		//Both (ThreadA and ThreadB) the thread are executing parallely at the same time
		ThreadRunnable threadRunnable = new ThreadRunnable();
		Thread threadC = new Thread(threadRunnable); //because Runnable doesn't have start() method
		threadC.start();
		//Now all three (ThreadA, ThreadB and ThreadRunnable) thread are executing parallely at the same time
	}

}
