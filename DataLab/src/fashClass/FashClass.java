package fashClass;

import java.io.*;
import java.util.*; 

public class FashClass {
	private ArrayList<Integer> tee = new ArrayList<Integer>();
	private ArrayList<Integer> trouser = new ArrayList<Integer>();
	private ArrayList<Integer> pullover = new ArrayList<Integer>();
	private ArrayList<Integer> dress = new ArrayList<Integer>();
	private ArrayList<Integer> coat = new ArrayList<Integer>();
	private ArrayList<Integer> sandal = new ArrayList<Integer>();
	private ArrayList<Integer> shirt = new ArrayList<Integer>();
	private ArrayList<Integer> sneaker = new ArrayList<Integer>();
	private ArrayList<Integer> bag = new ArrayList<Integer>();
	private ArrayList<Integer> boot = new ArrayList<Integer>();
	
	FashClass() {
	try {
	    Scanner scan = new Scanner(new File("C:\\Users\\F\\eclipse-workspace\\Unit7 DataLab\\src\\fashion-mnist_train.csv"));
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
		 for(int i = 1; i < arr.length; i += 140) {
			 list.add(Integer.valueOf(arr[i]));
		 }
}
	/**
	 * String name of ArrayList<Integer> given by an int representing order
	 * 0 T-shirt/top 
	 * 1 Trouser 
	 * 2 Pullover 
	 * 3 Dress 
	 * 4 Coat 
	 * 5 Sandal 
	 * 6 Shirt 
	 * 7 Sneaker 
	 * 8 Bag 
	 * 9 Ankle boot
	 * @param int i The int value representing the order of arrays, beginning at 0
	 */
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

	public void standardDeviation() {
		
	}
	
	public void standardDeviation(ArrayList<Integer> list) {
		
	}
	
	public String toString() {
		String str = "";
		str += "0 T-shirt/top = "+tee.size()+"\n";
		str += "1 Trouser = "+trouser.size() +"\n";
		str += "2 Pullover = "+pullover.size()+"\n";
		str += "3 Dress = "+dress.size()+"\n";
		str += "4 Coat = "+coat.size()+"\n";
		str += "5 Sandal = "+sandal.size()+"\n";
		str += "6 Shirt = "+shirt.size()+"\n";
		str += "7 Sneaker = "+sneaker.size()+"\n";
		str += "8 Bag = "+bag.size()+"\n";
		str += "9 Ankle boot = "+boot.size()+"\n";
		return str;
		
	//Accessor Methods
	public ArrayList<Integer> getTee() { 
		return ArrayList<Integer> tee }
	public ArrayList<Integer> getTrouser() { 
		return ArrayList<Integer> trouser }
	public ArrayList<Integer> getPullover() { 
		return ArrayList<Integer> pullover }
	public ArrayList<Integer> getDress() { 
		return ArrayList<Integer> dress }
	public ArrayList<Integer> getCoat() { 
		return ArrayList<Integer> coat }
	public ArrayList<Integer> getSandal() { 
		return ArrayList<Integer> sandal }
	public ArrayList<Integer> getShirt() { 
		return ArrayList<Integer> shirt }
	public ArrayList<Integer> getSneaker() { 
		return ArrayList<Integer> sneaker }
	public ArrayList<Integer> getBag() { 
		return ArrayList<Integer> bag }
	public ArrayList<Integer> getBoot() { 
		return ArrayList<Integer> boot }


	}
	
	public static void main(String[] args) {
		FashClass object = new FashClass();
		System.out.println(object.toString());
		
	}

}
