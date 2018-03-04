package prodconsthreads;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Consumer extends Thread {

	public Thread thread;
	private final Lock _mutex = new ReentrantLock(true); 

	public void Consume()
	{
		if(!Main.prod_queue.isEmpty())
		{
			Main.prod_queue.remove();
			System.out.println("Product consumed, size = " + Main.prod_queue.size());
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public void run() {
		
		while(true)
		{
			try
			{
				_mutex.lock();
				Consume();
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
