package advanced;

public class ProvaThread {

	public static void main(String[] args) {
		
		MioThread mt1 = new MioThread();
		
		Runnable r1 = () -> {
			int rip = 5;
			
			for (int i = 0; i< rip; i++) {
				
				try {
					System.out.println("Sono il runnable " + i);
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.err.println("runnable "+e.getMessage());
				}
				
			}
		};
		
		
		Thread newThread = new Thread(r1);
		
		newThread.start();
		
		mt1.start();
		
		int rip = 5;
		
		for (int i = 0; i< rip; i++) {
			
			try {
				System.out.println("Sono il main " + i);
				if (i == 3) {
					newThread.interrupt();
				}
				if (i == 4) {
					newThread.stop();
				}
				
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
			
		}
		
		

	}

}
