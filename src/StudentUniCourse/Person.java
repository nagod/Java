package StudentUniCourse;
/**
 * 
 * @author deniz
 *
 */

public class Person {

	private String  firstName; 
	private String lastName;
	private int age ;

	
	/**
	 * Creating a Person 
	 * @param firstName  Persons first name
	 * @param lastName  Persons last name
	 * @param age Persons age
	 * 
	 */
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 * Getter for FirstName 
	 * @return name of current Person
	 * */
	
	public String getFirstName() {
		return this.firstName;
	}
	/**
	 * Setter for FirstName
	 * @param firstName sets first name for current Person
	 * */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	/**
	 * Getter for LastName 
	 * @return name of current Person
	 * */
	
	public String getLastName() {
		return this.lastName;
	}
	/**
	 * Setter for LastName
	 * @param lastName sets last name for current Person
	 * */
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Getter for Age
	 * @return age 
	 */
	public int getAge() {
		return this.age;
	}
	/**
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}

