package fashClass;

import java.io.*;
// java.io.BufferedReader  
	// BufferedReader class reads the file line by line until the end character is reached.
	// The buffer size may be specified, or the default size may be used. 
	// * BufferedReader(Reader in, int sz)
import java.util.*; 

public class FashClass {
	private ArrayList<Integer> tee;
	private ArrayList<Integer> trouser;
	private ArrayList<Integer> pullover;
	private ArrayList<Integer> dress;
	private ArrayList<Integer> coat;
	private ArrayList<Integer> sandal;
	private ArrayList<Integer> shirt; 
	private ArrayList<Integer> sneaker; 
	private ArrayList<Integer> bag;
	private ArrayList<Integer> boot;
	
	FashClass() {
		try {
		BufferedReader in 
		 	= new BufferedReader(new FileReader("H:\\fashion-mnist_train.csv"));  
		
		in.readLine();
		  /* Similar to Scanner, nextLine(), this method will read the first line.
		   * This will register the line in history and will skip the first line
		   */

		String nextLine = null; //declares String nextLine
		String splitBy = ","; //delimiter 

		//loop will run from 2nd line
		 while ((nextLine = in.readLine()) != null) { 
			nextLine = in.readLine();
			String[] clothes = nextLine.split(splitBy);
			  /* public String[] split(String x)
			   * The method String.split() identifies the delimiter, splitting the string i.e. "johnny,sonny,fot" around matches of the given regular expression.
			   * returns a String array.
			   */     
			if(clothes[0].equals("0"))
				addMethod(clothes, tee);
			if(clothes[0].equals("1"))
				addMethod(clothes, trouser);
			if(clothes[0].equals("2"))
				addMethod(clothes, pullover);
			if(clothes[0].equals("3"))
				addMethod(clothes, dress);
			if(clothes[0].equals("4"))
				addMethod(clothes, coat);
			if(clothes[0].equals("5"))
				addMethod(clothes, sandal);
			if(clothes[0].equals("6"))
				addMethod(clothes, shirt);
			if(clothes[0].equals("7"))
				addMethod(clothes, sneaker);
			if(clothes[0].equals("8"))
				addMethod(clothes, bag);
			if(clothes[0].equals("9"))
				addMethod(clothes, boot);
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
		}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
	 	 	in.close();
      		}
		//All lines of the csv should've been scanned and added to their designated Integer ArrayLists at this point.
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
		FashClass obj = new FashClass();
		obj.mostPopular();
	}

}
