package Polynomial;
import Terms.Terms;
import test.Test;
import java.io.*;
import java.util.*;
/**
 * This class will have 5 member functions.
 * 1) Constructor to set the arrayList
 * 2) Insert: to insert the exponents and the coefficients.
 * 3) Delete: Removes the term with coefficients and exponents passed in as parameters.
 * 4) Reverse: That reverses the polynomial.
 * 5) Product: Computes the product of all the terms.
 * 6) Clear: Clears the array list.
 * @author Sudheesh
 *
 */
public class Polynomial {
	
	private ArrayList<Terms> array;
	Terms testObject;
	
	/**
	 * Creates an empty list
	 */
	
	public Polynomial(){
		 array= new ArrayList<Terms>();
	}
	/**
	 * PreCondition: The exponents and coefficients are passed in as arguments.
	 * PostCondition: The values are added to the polynomial in ascending order.
	 * @param x
	 * @param y
	 */
	public void Insert(int x, int y){
		/**
		 * In this Insert function, we are going to sort the values and add it into our ArrayList.
		 */
		testObject = new Terms(x,y);
		
		if(array.size()==0){
			array.add(testObject);
		}
		else{
			/**
			 * We are going to use the index of the object of Term object and get it's
			 * exponent and compare that exponent with the value passed as parameter.
			 */
			for(int i=0;i<array.size();i++){
				Terms index= array.get(i);
				int exponents= index.get_exponent();
				if(y>=exponents){
					array.add(i,testObject);
					return;
				}
			}
			array.add(testObject);
		}
		
	}
	
	/**
	 * PreCondition: The exponents and coefficients are passed in as arguments.
	 * PostCondition: The values with the exponent and coefficient is deleted from the Polynomial.
	 * @param x
	 * @param y
	 */
	
	public void Delete(int x,int y){
		for(Terms iter : array){
			if((iter.get_coefficient()==x)&&(iter.get_exponent()==y)){
				array.remove(iter);
				System.out.println("The values are deleted. Coefficient : "+x + ". Exponent : "+y);
				return;
			}
			
		}
		System.out.println("ERROR! The value not found.  Coefficient : "+x + ". Exponent : "+y);
	}
	
	/**
	 * This will return the product
	 */
	public String Product(){
		//System.out.println("The product is being called");
		//int count=0;
		int temp_count=0;
		String polynomial="",output="";
		for(Terms iter: array){
			if(temp_count==0){
				polynomial+=iter.toString();
			}
			else if(iter.get_coefficient()<0){
				polynomial+=iter.toString();
			}
			else{
				polynomial+=" + "+iter.toString();
			}
			//polynomial=polynomial+" + "+iter;
			temp_count++;
			
		}
		//array.clear();
		return polynomial;
		
		
	}
	/**
	 * This function will reverse the polynomial.
	 */
	public StringBuffer Reverse(){
		/*
		String string="";
		String reverse_string="";
		string=this.Product();
		for(int i=string.length()-1;i>=0;i--){
			reverse_string+=string.charAt(i);
		}*/
		//ArrayList<Terms> reverse_array = new ArrayList<Terms>();
		int temp_count=0;
		String temp="";
		StringBuffer reverse_string = new StringBuffer("");
		for(Terms iter : array){
			if(temp_count==array.size()-1){
				temp+=iter.toString();
			}
			else if(iter.get_coefficient()<0){
				temp+=iter.toString();
			}
			else{
				temp+=" + "+iter.toString();
			}
			
			reverse_string.insert(0, temp);
			//polynomial=polynomial+" + "+iter;
			temp="";
			temp_count++;
			
			
		}
		return reverse_string;
	}
	/**
	 * This function will empty the arrayList.
	 * I was having problem as all the polynomial was stored in the arrayList everytime
	 * we read from the file. So this is called after one line has been read from the file.
	 */
	public void clearArrayList(){
		array.clear();
	}
	
}
