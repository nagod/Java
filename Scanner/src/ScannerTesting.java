
import java.util.*;


public class ScannerTesting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Scanner sc = new Scanner(System.in);
	     while (true) {
	    	 String s = sc.next();
	    	 if (s.equals("q")) break;
	    	 System.out.println(s);
	     }
	     System.out.println("bye ...");
	     sc.close();
	}

}

