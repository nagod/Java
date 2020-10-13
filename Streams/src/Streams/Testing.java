package Streams;

import java.io.*;
public class Testing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("/Users/deniz/Desktop/java/Scanner/text.txt");
			out = new FileOutputStream("/Users/deniz/Desktop/java/Scanner/out.txt");
			
			int c;
			while( (c = in.read()) != -1){
				out.write(c);
			}
		}
		finally {
			if (in != null) in.close();
		    if (out != null) out.close();
		    System.out.println("Bye");
			}
	}

}
