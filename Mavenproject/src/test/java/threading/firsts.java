package threading;

public class firsts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		gh a=new gh();
		Thread b=new Thread(a);
		b.start();
		b.join();
		Thread q=new Thread(a);
		q.start();

	}

}



class gh implements Runnable{
	
	ThreadLocal<Integer> u=new ThreadLocal<Integer> (){
		
		protected Integer Initialvalue() {
			
			return 0;
			
		}
		
	};

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
	
	
}