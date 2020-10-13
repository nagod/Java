package Threading;

public class testing implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String [] args) {
		Thread firstOne = new Thread(new testing());
		firstOne.start();
		
		Thread secondOne = new Thread(new testing());
		secondOne.start();
	}
	

}
