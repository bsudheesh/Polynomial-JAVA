package Terms;

/**
 * This is the class term that has the following functions
 * 1) Constructor that sets the private member variables of the class.
 * 2) get_coefficient: that returns the coefficient for the exponent.
 * 3) get_exponent: that returns the exponent for the coefficient.
 * 4) toString: that returns the formatted string in the format given.
 * @author Sudheesh
 *
 */
public class Terms {
	private int exponent,coefficient;
	/**
	 * Initialises the private member variables of the class.
	 * Precondition: Proper values are passed as an argument to the constructor.
	 * Postcondition: Values are assigned to the private member variables.
	 * @param exponent
	 * @param coefficient
	 */
	public Terms(int coefficient,int exponent){
		this.exponent=exponent;
		this.coefficient=coefficient;
	}
	/**
	 * Precondition: There is a value for the coefficient
	 * Postcondition:  Returns the coefficient
	 * This function will also check to see if the proper conversion has 
	 * been made to the Integer. If the coefficient is not of type int then Error
	 * message is shown and -1 is returned.
	 * @return
	 */
	public int get_coefficient(){
		if(this.coefficient==(int)this.coefficient){
			return this.coefficient;
		}
		else{
			System.out.println("Error!! This number is not of type int");
			return -1;
		}
	}
	
	/**
	 * Precondition: There is a value for the exponent.
	 * Postcondition: Returns the exponent.
	 * This function will also check to see if the proper conversion has 
	 * been made to the Integer. If the exponent is not of type int then Error
	 * message is shown and -1 is returned.
	 * @return
	 */
	
	public int get_exponent(){
		if(this.exponent==(int)this.exponent){
			return this.exponent;
		}
		else{
			System.out.println("Error!! This number is not of type int");
			return -1;
		}
	}
	/**
	 * Precondition: The values for coefficient and exponents are present.
	 * Postcondition: The string is formatted in the proper style and returned.
	 * @return
	 */
	public String toString(){
		String formatted_string="";
		if(this.exponent==0){
			formatted_string+=Integer.toString(this.coefficient);
		}
		else if(this.exponent==1){
			formatted_string+=Integer.toString(this.coefficient)+"x";
		}
		else if(this.coefficient==0){
			formatted_string+="x^"+Integer.toString(this.exponent);
			
		}
		
		else{
			formatted_string+=Integer.toString(this.coefficient)+"x^"+Integer.toString(this.exponent);
		}
		return formatted_string;
		
	}
}
