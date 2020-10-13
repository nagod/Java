package Iters;

import java.util.*;
public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> set = new TreeSet<String>();
		Collections.addAll(set, "A","B","C");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) System.out.println(it.next());
	}

}
