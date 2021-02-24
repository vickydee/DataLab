package fashClass;

import java.io.*;
// java.io.BufferedReader  
	// BufferedReader class reads the file line by line until the end character is reached.
	// The buffer size may be specified, or the default size may be used. 
	// * BufferedReader(Reader in, int sz)

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
			String[] clothes += nextLine.split(splitBy);
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
		//All lines of the csv should've been scanned and added to their designated Integer ArrayLists.
	}

	private void addMethod(String[] arr, ArrayList<Integer> list) {
		 for(int i = 0; i < arr.length; i += 157)
			 list.add(Integer.parseInt(arr[i]));
	}
	
	// method 1: find mean standard deviation of all data
	// method 2: find mean standard deviation between label	
	
	public static void main(String[] args) {
		
	}

}
