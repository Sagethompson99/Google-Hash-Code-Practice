package hashcodePractice;

import java.io.File;
import java.util.Scanner;

public class PizzaPurchaser {
	
	 public void orderPizza(int[] numSlices, int numPizzaTypes) {}
	
	 public static void main(String[] args) throws Exception { 
		PizzaPurchaser p = new PizzaPurchaser();
	    File doc = new File(""); 
	    Scanner scan = new Scanner(doc); 
	    int maxSlices = scan.nextInt();
	    int numPizzaTypes = scan.nextInt();
	    int[] numSlices = new int[numPizzaTypes];
	    
	    for(int i = 0; i < numPizzaTypes; i++) {
	    	if(scan.hasNext())
	    		numSlices[i] = scan.nextInt();
	    }
	    p.orderPizza(numSlices, numPizzaTypes);
	  }
}
