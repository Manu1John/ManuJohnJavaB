import java.util.Scanner;

public class SampleThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a Limit");
			int L=s.nextInt();
			for(int i=0;i<L;i++) {
				System.out.println("Thread.count"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
	}




}
