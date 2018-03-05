package prodconsthreads;
import java.util.Queue;
import java.util.LinkedList;
public class Main {

	public static Queue<Integer> prod_queue = new LinkedList<Integer>();
	public static int stackCapacity = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer consumer = new Consumer();
		Producer producer = new Producer();
		
		producer.start();
		consumer.start();
		
		try
		{
			producer.join();
			consumer.join();
		}
		catch (Exception e)
		{
			System.out.println("Exception: " + e);
		}
		
	}
}
