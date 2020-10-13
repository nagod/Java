package main;

/**
 * 
 * @author deniz
 *
 */

public class Professor extends Person{

	private String teachingSubject; 
	
	
	/**
	 * Creating a Professor by inheriting from parent class Person 
	 * @see Person
	 * @param teachingSubject Subject the Prof. is lecturing 
	 * @param firstName  Professor first name
	 * @param lastName  Professor last name
	 * @param age Professor age
	 * 
	 */
	
	public Professor(String firstName, String lastName, int age, String teachingSubject) {
		super(firstName, lastName, age);
		this.teachingSubject= teachingSubject;
	}
	
	/**
	 * Getter for teachingSubject 
	 * @return teachingSubject of current student
	 * */
	
	public String getTeachingSubject() {
		return this.teachingSubject;
	}
	
	/**
	 * Setter for teachingSubject
	 * @param teachingSubject sets first name for current Student
	 * */
	public void setTeachingSubject(String teachingSubject) {
		this.teachingSubject = teachingSubject;
	}

	
}
