package prodconsthreads;
import java.util.Queue;
import java.util.LinkedList;
public class Main {

	public static Queue<Integer> prod_queue = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer consumer = new Consumer();
		Producer producer = new Producer();
		
		producer.run();
		consumer.run();
		
	}
}
