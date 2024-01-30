package MultithreadingDemo;

public class LifeCycleOfThreadExample {
	
static class MyThread extends Thread {
    	
        public void run() {
            System.out.println("Thread is in the RUNNABLE state.");
            
            try {
                Thread.sleep(2000); // Simulating some work
            } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("Thread has completed its execution.");
        }
    }	

    public static void main(String[] args) {
        // Creating a thread instance
       // MyThread myThread = new MyThread();
        MyThread myThread = new MyThread();

        // Thread is in the NEW state after instantiation
        System.out.println("Thread is in the NEW state.");

        // Starting the thread
        myThread.start(); //calling run method automatically

        // Thread is now in the RUNNABLE state
        System.out.println("Thread has been started and is in the RUNNABLE state.");

        try {
            Thread.sleep(1000); // Main thread sleeps for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Thread may be in TIMED_WAITING state if it is sleeping
        System.out.println("After sleeping, thread may be in TIMED_WAITING state.");

        try {
            myThread.join(); // Main thread waits for myThread to complete
        } catch (InterruptedException e) {		
            e.printStackTrace();
        }

        // Thread is in TERMINATED state after completion
        System.out.println("Thread is in the TERMINATED state.");
    }
}