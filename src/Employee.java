import java.text.DecimalFormat;

/**
 *  One object of class Employee stores the personal information for one Employee.
 */

public class Employee {
	private static int count = 0; //want it "static" as I'll be calling it from other objects!!
	
	private String name;
	/**
	 * sets the value of name to "newName"
	 */
	public void setName(String newName) {        //DONE
		name = newName;
	}
	/**
	 * returns the current value of name
	 */
	public String getName() {                   //DONE
		return name;
	}
	
	private String ssn;
	/**
	 * sets the value of ssn to "newSsn"
	 */
	public void setSsn (String newSsn) {        //DONE
		ssn = newSsn;
	}
	/**
	 * returns the current value of ssn
	 */
	public String getSsn() {
		return ssn;
	}
	
	private double salary;
	/**
	 * sets the value of salary to "newSalary"
	 */
	public void setSalary(double newSalary) {     //DONE
        salary =  newSalary;
	}
	/***************************************************************************/                                                
	/** returns the current value of salary. I'M DOING A CONVERSION HERE TO   **/
	/** PRINT OUT 2 DIGITS TO RIGHT OF THE DECIMAL                            **/
	/***************************************************************************/
	public String getSalary() {
		DecimalFormat df = new DecimalFormat("0.00");
		return df.format(salary);  
	}
	/*
	 * default constructor for Employee class object which assigns default values for all class properties
	 */
	public Employee() {
		this.setName("null");
		this.setSsn("000-00-0000");
        this.setSalary(0.00);
		count++;
	}
	
	/**
	 * parameterized constructor for Employee class object which assigns values for all class properties
	 * based on the values sent into the parameters.
	 */
	public Employee(String name, String ssn, double salary) {
		this.setName(name);
		this.setSsn(ssn);
		this.setSalary(salary);
		count++;
	}
		
	/**
	 * Returns a String containing all the data stored in this object.
	 */
	public String toString() {
		String result = "Name: " + this.getName() 
				+ "\nSSN#: " + this.getSsn()
				+ "\nSalary: $" + this.getSalary() + "\n";
		return result;
	}
	
	/**
	 * Returns the number of Employee objects created
	 */
	
	public int getCounter()	{
		return count;
	}
	
}
