package StudentUniCourse;

import java.util.*;
/**
 * 
 * @author deniz
 *
 */

public class University {

	
	private String name;
	private List<Professor> profs = new LinkedList<Professor>();
	private List<Student> students = new LinkedList<Student>();
	
	/**
	 * 
	 * @param name Name of University
	 */
	public University(String name) {
		this.name = name;
	}
}
