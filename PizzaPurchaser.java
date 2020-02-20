package hashcodePractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PizzaPurchaser {
	
	 public void orderPizza(int[] pizzas, int numPizzaTypes, int maxSlices) throws IOException {
		 ArrayList<Integer> pizzasToOrder = new ArrayList<Integer>() {};
		 int numSlicesOrdered = 0;
		 int numPizzasOrdered = 0;
		 int currentIndex = numPizzaTypes-1;
		 
		 while(currentIndex >= 0 && numSlicesOrdered != maxSlices) {
			 if(pizzas[currentIndex] < maxSlices && pizzas[currentIndex] + numSlicesOrdered <= maxSlices) {
				 numSlicesOrdered += pizzas[currentIndex];
				 pizzasToOrder.add(currentIndex);
				 numPizzasOrdered += 1;
			 }
			 currentIndex -= 1;
		 }
		 
		 createResultsFile(numPizzasOrdered, pizzasToOrder);
	 }
	 
	 public void createResultsFile(int numPizzasOrdered, ArrayList<Integer> pizzasToOrder) throws IOException {
		 BufferedWriter writer = new BufferedWriter(new FileWriter("results"));
		 writer.write(numPizzasOrdered + "\n");
		 
		 for(int i = pizzasToOrder.size()-1; i >= 0; i--) {
			 writer.append(pizzasToOrder.get(i) + "");
			 if(i != 0) 
				 writer.append(" ");
		 }
		 writer.close();
	 }
	
	 public static void main(String[] args) throws Exception { 
		PizzaPurchaser p = new PizzaPurchaser();
	    File doc = new File("c_medium.in"); 
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
