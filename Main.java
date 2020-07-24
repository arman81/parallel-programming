public class Main{

	public static void main(String[] args){
		Thread thread = new Thread(new Runnable(){
	           @Override
	   	   public void run(){
		   	System.out.println("Thread is running "+Thread.currentThread().getName());
		   }	   
		});
		thread.setName("Worker Thread");
		thread.start();
	}
}
