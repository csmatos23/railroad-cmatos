package cs342.railroadcross;
import java.security.SecureRandom ;
public class Track implements Runnable{
	private static final SecureRandom generator = new SecureRandom() ;
	
	public Track(){
		
	}
	
	public void run(){
		int count=0;
		for(;count<10; count++){
			try{
				Thread.sleep((generator.nextInt(2000))+1000) ;
				
				//inform controller that train is approaching
				
				Thread.sleep((generator.nextInt(1000))+1000) ;
				
				//inform controller that train is in crossing
				
				Thread.sleep((generator.nextInt(500))+500) ;
				
				//inform controller that train has left
			}
			catch(InterruptedException e){
				Thread.currentThread().interrupt() ;
			}
		}
		
	}
}
