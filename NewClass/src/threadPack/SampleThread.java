package threadPack;

public class SampleThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=1; i<=10; i++) {
			System.out.println("Thread Count" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
