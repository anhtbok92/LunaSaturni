
import java.util.List;
import java.util.ArrayList;
//import static org.junit.Assert.*;
//import org.junit.Test;
import java.math.*;
//import com.numericalmethod.suanshu.number.big.BigDecimalUtils;

public class FizzBuzz{

    //compute factorial of x
    public static BigInteger factorialIter(int x){
	//1*2*3…*x 
	if (x < 1) {
	    throw new IllegalArgumentException("x is positive");
	}
	//assertEquals(x, 40);
	//System.out.println(" x " + x);
	BigInteger f = new BigInteger("1");
	//long f = 1;
	BigInteger counter = new BigInteger("1");
	String s = Integer.toString(x+1);
	BigInteger bi =  new BigInteger(s);
	while (!counter.equals(bi)){
	    f =  f.multiply(counter);
	    //System.out.println(" f " + f);
	    counter = counter.add(new BigInteger("1"));
	} 
	
	
	return f;
    }


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
			//System.out.println("FizzBuzz");
			//sb.append(" FizzBuzz, ");
			list.add("FizzBuzz");
		    }//if
		    else {
			//System.out.println("Fizz");
			//sb.append(" Fizz, ");
			list.add("Fizz");
		    }
		} //if
		else {//number is not divisable by 3
		    if ((i % 5) == 0){
			System.out.println("Buzz");
			//sb.append(" Buzz, ");
			list.add("Buzz");
		    } 
		    else{
			System.out.println(i);
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
	    System.out.println("good job!!!");
	}

	//return sb.toString();
	return list;
    }

    public static void main(String [] args){
    
	try{
	    List<String> list = FizzBuzz.fizzBuzz(1000000000);
	    //for (String s : list) System.out.println(s);
	}
	catch(OutOfMemoryError e){
	    System.out.println("Out of memory error");
	    }

	BigInteger f = FizzBuzz.factorialIter(5);
	BigDecimal d =  new BigDecimal(f);
	//BigDecimal l = d.round(new MathContext(1));
	int l = d.round(new MathContext(1)).scale() * -1 + 1;
	System.out.println(" length " + l);
    }
}

