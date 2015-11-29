//there are 2 problems in this class (because of lazyness), nothing to do with each others

//write an algorithm that prints all numbers between 1 and n, replacing multiples
//of 3 with the String Fizz, multiples of 5 with Buzz and multiples of 15 with FizzBuzz.
//see the method public static List<String> fizzBuzz(int n){...}

//write a factorial that does not use resursion
//see the method public static BigInteger factorialIter(int x){...}

import java.util.List;
import java.util.ArrayList;
import java.math.*;

public class FizzBuzz{

    //compute factorial of x
    public static BigInteger factorialIter(int x){
	//1*2*3…*x 
	if (x < 1) {
	    throw new IllegalArgumentException("x is positive");
	}
       
	BigInteger f = new BigInteger("1");
	//long f = 1;
	BigInteger counter = new BigInteger("1");
	String s = Integer.toString(x+1);
	BigInteger bi =  new BigInteger(s);
	while (!counter.equals(bi)){
	    f =  f.multiply(counter);
	    counter = counter.add(new BigInteger("1"));
	} 
	
	
	return f;
    }

    //computes the fizzbuzz problem
    public static List<String> fizzBuzz( int n){
	
       
	//if (n < 1) n = 1;
	//StringBuilder sb = null;
	List<String> list = null;
	try{
	    //sb =  new StringBuilder(n);
	    list = new ArrayList<String>(n);
        
	    for (int i = 1; i <= n; i++){
		if (( i % 3 ) == 0) {
		    if ((i % 5) == 0) {
		       
			//sb.append(" FizzBuzz, ");
			list.add("FizzBuzz");
		    }//if
		    else {
			
			//sb.append(" Fizz, ");
			list.add("Fizz");
		    }
		} //if
		else {//number is not divisable by 3
		    if ((i % 5) == 0){
			
			//sb.append(" Buzz, ");
			list.add("Buzz");
		    } 
		    else{
			
			//sb.append(Integer.toString(i) + " , ");
			list.add(Integer.toString(i));
		    }
		} //else
		
	    }//for
	    
	}
	//catch(NegativeArraySizeException e){
	catch(Exception e){
	    if (n < 1) System.out.println("the number should be positive");
	}
       

	finally{
	    //System.out.println("good job!!!");
	}

	//return sb.toString();
	return list;
    }

    public static void main(String [] args){
	int num = 100;

	try{
	    List<String> list = FizzBuzz.fizzBuzz(num);
	    for (String s : list) System.out.print(s + " , ");
	}
	catch(OutOfMemoryError e){
	    System.out.println("Out of memory error");
	    }

	BigInteger f = FizzBuzz.factorialIter(num);
	BigDecimal d =  new BigDecimal(f);
       
	int l = d.round(new MathContext(1)).scale() * -1 + 1;
	System.out.println("\nfactorial of " + num + " is " +  f +  " length " + l);
    }
}

