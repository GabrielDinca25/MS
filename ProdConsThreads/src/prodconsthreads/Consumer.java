package prodconsthreads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer implements Runnable {

	public Thread thread;
	private final Lock _mutex = new ReentrantLock(true); 

	public void Consume()
	{
		System.out.println("Pe consume");
		if(!Main.prod_queue.isEmpty())
		{
			Main.prod_queue.remove();
			System.out.println("Product consumed \n");
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public void run() {
		
		while(true)
		{
			try
			{
				System.out.println("Pe consume");
				_mutex.lock();
				Consume();
				_mutex.unlock();
			} catch (Exception e) {

	            e.printStackTrace();
	        } 
			finally
			{
	        	_mutex.unlock();
			}
		}
		
	}
}
