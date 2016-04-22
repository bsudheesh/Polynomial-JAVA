package test;
import Polynomial.Polynomial;
import Terms.Terms;
import java.io.*;
import java.util.*;
/**
 * This class will call all the functions that are in class Polynomial and Terms.
 * @author Sudheesh
 *
 */
public class Test {
	public static void main(String[] args){
		//Terms termsObject= new Terms();
		String line=null,exponent_string="",coefficient_string="";
		int exponent=0,coefficient=0;
		File fileName = new File("file.txt");
		try{
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while((line=bufferedReader.readLine())!=null){
				String[] spiltter=line.split(";");
				for(int i=1;i<spiltter.length;i++){
					if(i%2!=0){
						coefficient_string=spiltter[i];
						coefficient=Integer.parseInt(coefficient_string);
					}
					else{
						exponent_string=spiltter[i];
						exponent=Integer.parseInt(exponent_string);
						Terms termsObject= new Terms(exponent,coefficient);
						System.out.println("The exponent is : "+termsObject.get_coefficient()+ " The exponent is : "+termsObject.get_exponent()+" The exponent is : "+termsObject.toString());
					}
					
					
				}
				
			}
			bufferedReader.close();
			
			
		}
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file");
		}
		catch(IOException ex){
			System.out.println("ERROR : "+ex);
		}
	}

}
