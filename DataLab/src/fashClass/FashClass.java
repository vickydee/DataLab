package fashClass;

import java.io.*;
import java.util.*; 

public class FashClass {
	private ArrayList<Integer> tee, trouser, pullover, dress, coat, sandal, shirt, sneaker, bag, boot;
		/* 0 T-shirt/top 
		 * 1 Trouser 
		 * 2 Pullover 
		 * 3 Dress 
		 * 4 Coat 
		 * 5 Sandal 
		 * 6 Shirt 
		 * 7 Sneaker 
		 * 8 Bag 
		 * 9 Ankle boot
		 */
	FashClass() {
	    try {
	      Scanner scan = new Scanner(new File("input.csv"));
	      scan.nextLine();
	      while(scan.hasNextLine()) {
		String line = scan.nextLine();
		String[] spltLn = line.split(",");
		  /* public String[] split(String x)
		   * The method String.split() identifies the delimiter, splitting the string i.e. "johnny,sonny,fot" around matches of the given regular expression.
		   * returns a String array.
		   */ 
			if(spltLn[0].equals("0"))
				addMethod(spltLn, tee);
			if(spltLn[0].equals("1"))
				addMethod(spltLn, trouser);
			if(spltLn[0].equals("2"))
				addMethod(spltLn, pullover);
			if(spltLn[0].equals("3"))
				addMethod(spltLn, dress);
			if(spltLn[0].equals("4"))
				addMethod(spltLn, coat);
			if(spltLn[0].equals("5"))
				addMethod(spltLn, sandal);
			if(spltLn[0].equals("6"))
				addMethod(spltLn, shirt);
			if(spltLn[0].equals("7"))
				addMethod(spltLn, sneaker);
			if(spltLn[0].equals("8"))
				addMethod(spltLn, bag);
			if(spltLn[0].equals("9"))
				addMethod(spltLn, boot);
	      }
	      scan.close();

	    } catch(Exception e) {
	      e.getStackTrace();
	    }
	}
	
	private void addMethod(String[] arr, ArrayList<Integer> list) {
		 for(int i = 0; i < arr.length; i += 157)
			 list.add(Integer.parseInt(arr[i]));
	}
	
	public void mostPopular() {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(tee);
		arr.add(trouser);
		arr.add(pullover);
		arr.add(dress);
		arr.add(coat);
		arr.add(sandal);
		arr.add(shirt);
		arr.add(shirt);
		arr.add(sneaker);
		arr.add(bag);
		arr.add(boot);
		int index = 0;
		for (int i = 1; i < arr.size(); i++) {
			if(arr.get(i-1).size() < arr.get(i).size()) {
				index = i;
			}
		}
		System.out.println("The most popular fashion item is " + nameMethod(index));
	}
	public String nameMethod(int i) {
		if(i == 0)
			return "t-shirts/tees";
		if(i == 1)
			return "trousers";
		if(i == 2)
			return "pullovers";
		if(i == 3)
			return "dresses";
		if(i == 4)
			return "coats";
		if(i == 5)
			return "sandals";
		if(i == 6)
			return "shirts";
		if(i == 7)
			return "sneakers";
		if(i == 8)
			return "bags";
		if(i == 9)
			return "boots";
		return null;
	}
	// method 1: find mean standard deviation of all data
	// method 2: find mean standard deviation between label	
	
	public static void main(String[] args) {
		
	}

}
