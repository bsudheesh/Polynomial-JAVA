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
 * 5) Prouct: Computes the product of all the terms.
 * @author Sudheesh
 *
 */
public class Polynomial {
	
	ArrayList<Terms> array;
	private int count=0;
	Terms testObject;
	private String new_String="";
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
		//String output="";
		testObject = new Terms(x,y);
		array.add(testObject);
		/*
		new_String=testObject.toString();
		output+=new_String;
		*/
		
		
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
				System.out.println("The values are deleted");
				return;
			}
			
		}
		System.out.println("ERROR! The value not found");
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
				polynomial+="+"+iter.toString();
			}
			//polynomial=polynomial+" + "+iter;
			temp_count++;
			
		}
		count++;
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
				temp+="+"+iter.toString();
			}
			
			reverse_string.insert(0, temp);
			//polynomial=polynomial+" + "+iter;
			temp="";
			temp_count++;
			
			
		}
		return reverse_string;
	}
	public void clearArrayList(){
		array.clear();
	}
	
}
