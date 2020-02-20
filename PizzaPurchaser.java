package hashcodePractice;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PizzaPurchaser {
	
	 public void orderPizza(int[] pizzas, int numPizzaTypes, int maxSlices) {
		 ArrayList<Integer> pizzasToOrder = new ArrayList<Integer>() {};
		 int numSlicesOrdered = 0;
		 int numPizzasOrdered = 0;
		 int currentIndex = numPizzaTypes-1;
		 
		 while(currentIndex >= 0) {
			 if(pizzas[currentIndex] < maxSlices && pizzas[currentIndex] + numSlicesOrdered <= maxSlices) {
				 numSlicesOrdered += pizzas[currentIndex];
				 pizzasToOrder.add(currentIndex);
				 numPizzasOrdered += 1;
			 }
			 currentIndex -= 1;
		 }
		 System.out.println("Target Slices: " + maxSlices);
		 System.out.println("Slices Ordered: " + numSlicesOrdered);
		 System.out.println("Num Pizzas Ordered: " + numPizzasOrdered);
		 System.out.print("Pizzas Ordered: ");
		 for(int i = pizzasToOrder.size()-1; i >= 0; i--)
			 System.out.print(pizzasToOrder.get(i) + "  ");
	 }
	
	 public static void main(String[] args) throws Exception { 
		PizzaPurchaser p = new PizzaPurchaser();
	    File doc = new File("e_also_big.in"); 
	    Scanner scan = new Scanner(doc); 
	    int maxSlices = scan.nextInt();
	    int numPizzaTypes = scan.nextInt();
	    int[] numSlices = new int[numPizzaTypes];
	    
	    for(int i = 0; i < numPizzaTypes; i++) {
	    	if(scan.hasNext())
	    		numSlices[i] = scan.nextInt();
	    }
	    p.orderPizza(numSlices, numPizzaTypes, maxSlices);
	  }
}
