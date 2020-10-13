package main;
import java.util.*;

/**
 * This class represents Courses in university
 * @author deniz
 *
 */
public class Course {

	private String courseName;  
	private int courseLimit;
	private List<Student> courseList = new LinkedList<Student>();
	
	
	/**
	 * Constructor for generating a Course
	 * @param courseName Name of the course
	 * @param courseLimit Max. number of participants 
	 */
	
	public Course(String courseName, int courseLimit) {
		this.courseName = courseName;
		this.courseLimit = courseLimit;
	}
	/**
	 * Function for adding Students to Courses 
	 * Checks weather Course if full || student already in Course
	 * 
	 * Sends message if succeed 
	 * @param student
	 */
	
	public void subscribe(Student student) {
		if ( courseList.size() > courseLimit) {
			System.out.println("Registration failed. Limit reached ");
		}else if(courseList.contains(student)) {
			System.out.println("Already registered for that Course");
		}
		else {
			courseList.add(student);
			System.out.printf("%s %s has been registered for %s", student.getFirstName(), student.getLastName(), this.courseName);
		}
	}
	/**
	 * Unsubscribing  from Course
	 * @param student
	 */
	
	public void unsubscribe(Student student) {
		if(courseList.contains(student)) {
			courseList.remove(student);
			System.out.println("You have been succesfuly unsubcribed from this course");
		}
	}
	
	
}
