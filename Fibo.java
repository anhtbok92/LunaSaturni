//Write a method that returns a Fibonacci sequence from 1 to n.
import java.util.List;
import java.util.ArrayList;

public class Fibo{

    public static List<Integer> getSequence(int n){
	List<Integer> list = new ArrayList<Integer>();
       
	    for (int i = 1; i <= n; i++){
		list.add(getNth(i));

	    }
	    return list;
    } 
    
    private static int getNth(int n){

	if ((n == 1) || (n == 2)) return 1;
	else {
	    return getNth(n-1) + getNth(n-2);
	}
    }

   
}
