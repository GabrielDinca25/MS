package prodconsthreads;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable {
	public Thread thread;
	private final Lock _mutex = new ReentrantLock(true); 
	
	public void Produce()
	{
		if(Main.prod_queue.size() <= 4)
		{
			Main.prod_queue.add(1);
			System.out.println("Product produced, size = " + Main.prod_queue.size());
		}
		try {
			Thread.sleep(1000);
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
				_mutex.lock();
				Produce();
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
