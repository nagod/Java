
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class ScannerFile {

	public static void main(String[] args) {
		
		Scanner scanner; 
        try { 
            scanner = new Scanner(new File("text.txt"), 
                    "UTF-8"); 
            scanner.useLocale(Locale.GERMANY); 
            int i; 
            double d; 
            while (scanner.hasNext()) { 
                if (scanner.hasNextInt()) { 
                    i = scanner.nextInt(); 
                    System.out.println("Int: " + ++i); 
                }else if (scanner.hasNextDouble()) { 
                    d = scanner.nextDouble(); 
                    System.out.println("Double: " + ++d); 
                } else { 
                    System.out.println("String: " + scanner.next()); 
                } 
            } 
            scanner.close(); 
        } catch (FileNotFoundException e) { 
            e.printStackTrace(); 
        } 
    } 
}
