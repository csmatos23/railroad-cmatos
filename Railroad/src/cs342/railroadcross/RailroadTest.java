package cs342.railroadcross;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit ;

public class RailroadTest {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newCachedThreadPool() ;
		
		
		
		executorService.shutdown();
		try {
			executorService.awaitTermination(1, TimeUnit.MINUTES) ; }
		catch (InterruptedException e) {
			System.out.println("Thread was interrupted!") ;
		}

	}

}
