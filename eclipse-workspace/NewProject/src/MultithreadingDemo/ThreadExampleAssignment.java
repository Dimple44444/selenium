package MultithreadingDemo;

public class ThreadExampleAssignment {

	public static void main(String[] args) throws InterruptedException {
		 
		Thread t1= new Thread();
		Thread t2= new Thread();
		{	
			try
			{
				System.out.println("Thread T1 is running");
				Thread.sleep(2000); // Simulating some work
            } catch (InterruptedException e) {
               e.printStackTrace();
				
				
			}
		}
				
		t1.start();
	
		
		try
		{
			t1.join();
			System.out.println("Main Thread is joining after t1");
			
			System.out.println("Thread t2 is running ");
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
               e.printStackTrace();
				
			}
		System.out.println("Thread t2 has completed.");
		t1.join();
        System.out.println("Main thread is continuing after joining t1 again.");
        t2.join();
        
        System.out.println("Joining t1 and t2 thread");
        System.out.println("Main thread is continuing after joining t2.");
    } 
	
        }



