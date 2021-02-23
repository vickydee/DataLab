package fashClass;

import java.io.*;
import java.io.BufferedReader;  
	// BufferedReader class reads the file line by line until the end character is reached.
	// The buffer size may be specified, or the default size may be used. 
	// * BufferedReader(Reader in, int sz)
import java.io.FileReader;  
import java.io.IOException; 

public class FashClass {
	private ArrayList<String> label;

	private ArrayList<String> tee;
	private ArrayList<String> trouser;
	private ArrayList<String> pullover
	private ArrayList<String> dress;
	private ArrayList<String> coat;
	private ArrayList<String> sandal;
	private ArrayList<String> shirt; 
	private ArrayList<String> sneaker; 
	private ArrayList<String> bag;
	private ArrayList<String> boot;
	
	FashClass() {
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
		

		 BufferedReader in 
		 	= new BufferedReader(new FileReader("H:\\fashion-mnist_train.csv"));  
		 in.readLine(); // Similar to Scanner, nextLine(), this will read the first line
		 // This will register the line in history and will skip the first line
		 String nextLine = null; //declare String nextLine
		//loop will run from 2nd line
		 String splitBy = ","; //delimiter 
		 while (( nextLine = in.readLine() ) != null)
		 { 
		 nextLine = in.readLine();
		 String[] clothes += nextLine.split(splitBy);
		  /* public String[] split(String x)
		   * The method String.split() identifies the delimiter, splitting the string i.e. "johnny,sonny,fot" around matches of the given regular expression.
		   * returns a String array.
		   */     
		 for(int i = 0; i < clothes.length; i += 140)
		 {
		  if(i == 0) 
		   label.add(clothes[i]);
		 }
		 }
		
		for(int i = 0;) {
			// arr[] = in.readLine();
		}
	}
	
	public static void main(String[] args) {
		
	}

}
