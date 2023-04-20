package advanced;

public class MioThread extends Thread {

	@Override
	public void run() {
		
		int ripetizioni = 5;
		
		for (int i = 0; i < ripetizioni; i++) {
			
			try {
				System.out.println("Sono il thread mio thread " + i);
			
				sleep(3000);
			} catch (InterruptedException e) {
				System.err.println("Si è verificato un errore: " +e.getMessage());
			}
			
		}
	}
}
