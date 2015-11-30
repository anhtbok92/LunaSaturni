import java.util.List;

public class Problems{

    public static void main(String [] args){
	
	System.out.println("Fibonacci sequence from 1 to n.");
	List<Integer> list = Fibo.getSequence(16);
	for (Integer i: list) System.out.println(i);
    }
} 
