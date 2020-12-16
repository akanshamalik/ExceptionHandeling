
public class ThreadPriority extends Thread{
		String name;
//		int i=0;
		public ThreadPriority(String name) {
			this.name = name;
		}
		public void run() {
		}
	
	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority("Process 1");
		ThreadPriority t2 = new ThreadPriority("Process 2");
		ThreadPriority t3 = new ThreadPriority("Process 3");
		ThreadPriority t4 = new ThreadPriority("Process 4");
		ThreadPriority t5 = new ThreadPriority("Process 5");
		ThreadPriority t6 = new ThreadPriority("Process 6");

		System.out.println("t1 thread priority : "+ t1.getPriority());
		System.out.println("t2 thread priority : "+ t2.getPriority());
		System.out.println("t3 thread priority : "+ t3.getPriority());
		System.out.println("t4 thread priority : "+ t4.getPriority());
		System.out.println("t5 thread priority : "+ t5.getPriority());
		System.out.println("t6 thread priority : "+ t6.getPriority());
		
		t1.setPriority(3);
		t2.setPriority(7);
		t3.setPriority(8);
		t4.setPriority(10);
		t5.setPriority(1);
		t6.setPriority(7);

		System.out.println("After changing the priority:");
		System.out.println("t1 thread priority : "+ t1.getPriority());
		System.out.println("t2 thread priority : "+ t2.getPriority());
		System.out.println("t3 thread priority : "+ t3.getPriority());
		System.out.println("t4 thread priority : "+ t4.getPriority());
		System.out.println("t5 thread priority : "+ t5.getPriority());
		System.out.println("t6 thread priority : "+ t6.getPriority());
		
	}

}
