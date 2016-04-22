package Terms;
import test.Test;
import Polynomial.Polynomial;
public class Terms {
	private int exponent,coefficient;
	public Terms(int exponent,int coefficient){
		this.exponent=exponent;
		this.coefficient=coefficient;
	}
	public int get_coefficient(){
		return this.coefficient;
	}
	public int get_exponent(){
		return this.exponent;
	}
	public String toString(){
		String formatted_string="";
		if(this.exponent!=0){
			formatted_string+=Integer.toString(this.coefficient)+"x^"+Integer.toString(this.exponent);
		}
		else{
			formatted_string+=Integer.toString(this.coefficient);
		}
		return formatted_string;
		
	}
}
