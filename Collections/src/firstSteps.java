
import java.util.*;
public class firstSteps {

	public static void fill(Collection<String> c) {
		c.add("z");
		c.add("y");
		c.add("x");
	}
	
	public static void main(String[] args) {
		List<String> nl = new LinkedList<String>();
		List<String> nl2 = new LinkedList<String>();
		fill(nl);
		
		nl2.add("deniz");
		nl2.add("deniz1");
		nl2.add("deniz2");
		
		System.out.println("Unsorted : \n " + nl);
		Collections.sort(nl);
		System.out.println("orted : \n " + nl + "\n");
		
		nl.addAll(nl2);
		System.out.println("nl1 + nl2 \n" + nl);
		
		Collections.sort(nl);
		System.out.println("SORTED : nl1 + nl2 ->  \n" + nl);
		
		nl2.clear();
		System.out.println("Cleared list : " + nl2);
		
		System.out.println("is the name deniz in nl  ? \n" + nl.contains("deniz"));
		
		LinkedList<String> g1 = new LinkedList<String>(Arrays.asList("d"));
		System.out.println(g1);
	}
}
