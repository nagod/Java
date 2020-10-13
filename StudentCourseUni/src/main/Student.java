package main;

/**
 * This class represents a Student 
 * 
 * @author deniz
 *
 */
public class Student extends Person{
	
	private String subject;
	private int semester;
	private long id;
	
	
	/**
	 * Creating a Student by inheriting from parent class Person 
	 * @see Person
	 * @param id  Students id
	 * @param semester  Semester student is in
	 * @param subject Subject he/she/it is studying 
	 * @param firstName  Student first name
	 * @param lastName  Student last name
	 * @param age Student age
	 * 
	 */
	
	public Student(String firstName, String lastName, int age, int semester, int id, String subject) {
		super(lastName, lastName, age);
		this.id = id;
		this.semester = semester;
		this.subject = subject;
	}
	
	/**
	 * Getter for Id 
	 * @return Id of current student
	 * */
	
	public long getId() {
		return this.id;
	}
	
	/**
	 * Setter for id
	 * @param id sets first name for current Student
	 * */
	public void setFirstName(long id) {
		this.id = id;
	}
	
	
	/**
	 * Getter for subject 
	 * @return subject of current student
	 * */
	
	public String getSubject() {
		return this.subject;
	}
	/**
	 * Setter for subject
	 * @param subject sets last name for current Student
	 * */
	public void setlastName(String subject) {
		this.subject = subject;
	}
	
	/**
	 * Getter for semester 
	 * @return semester of current student
	 * */
	
	public int getSemester() {
		return this.semester;
	}
	/**
	 * Setter for subject
	 * @param semester sets last name for current Student
	 * */
	public void setSemester(int semester) {
		this.semester = semester;
	}
	

}





