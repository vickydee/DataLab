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

	public double standardDeviation() {
		double std = standardDeviation(tee);
		std += standardDeviation(trouser);
		std += standardDeviation(pullover);
		std += standardDeviation(dress);
		std += standardDeviation(coat);
		std += standardDeviation(sandal);
		std += standardDeviation(shirt);
		std += standardDeviation(sneaker);
		std += standardDeviation(bag);
		std += standardDeviation(boot);
	 return std / 10;
	}
	
	public double standardDeviation(ArrayList<Integer> list) {
		int[] arr = convertIntegers(list);
		double sum = 0.0;
		int size = arr.length;
		double sdDev = 0.0;
		
		for(int num : arr) { 
			sum += num;
		}
		double mean = sum/size;
		
        	for(double num: arr) {
           	 sdDev += Math.pow(num-mean, 2);
        	}
		sdDev = Math.sqrt(sdDev/size);
	 return sdDev;
	}
	
	private int[] convertIntegers(ArrayList<Integer> list) {
	 int[] arr = new int[list.size()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i).intValue();
		}
	 return arr;
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
	}
		
	//Accessor Methods
		public ArrayList<Integer> getTee() { 
			return tee }
		public ArrayList<Integer> getTrouser() { 
			return trouser }
		public ArrayList<Integer> getPullover() { 
			return pullover }
		public ArrayList<Integer> getDress() { 
			return dress }
		public ArrayList<Integer> getCoat() { 
			return coat }
		public ArrayList<Integer> getSandal() { 
			return sandal }
		public ArrayList<Integer> getShirt() { 
			return shirt }
		public ArrayList<Integer> getSneaker() { 
			return sneaker }
		public ArrayList<Integer> getBag() { 
			return bag }
		public ArrayList<Integer> getBoot() { 
			return boot }
	
	//Mutator Methods
		public void addToTee(int i) { 
			tee.add(i);}
		public void addToTrouser(int i) { 
			trouser.add(i);}
		public void addToPullover(int i) { 
			pullover.add(i);}
		public void addToDress(int i) { 
			dress.add(i);}
		public void addToCoat(int i) { 
			coat.add(i);}
		public void addToSandal(int i) { 
			sandal.add(i);}
		public void addToShirt(int i) { 
			shirt.add(i);}
		public void addToSneaker(int i) { 
			sneaker.add(i);}
		public void addToBag(int i) { 
			bag.add(i);}
		public void addToBoot(int i) { 
			boot.add(i);}

	
	public static void main(String[] args) {
		FashClass object = new FashClass();
		System.out.println(object.toString());
		System.out.println("Standard Deviation of all data: " + object.standardDeviation());
		object.funct();
	}
	
	public void funct() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to FashClass; choose from the available methods:");
		System.out.println("Type sd for standardDeviation()\n ac to print lists\n mu for mutator methods\n ts for toString()");
		String in = scan.nextLine();
			if(in.equals("sd")){
			   System.out.println("Type to choose: all, tee, trouser, pullover, dress, or boot");
			   in = scan.nextLine();
				if(in.equals("all"))
				   System.out.println("Standard Deviation: "+object.standardDeviation());
				if(in.equals("tee"))
				   System.out.println("Standard Deviation: "+object.standardDeviation(object.getTee()));
				if(in.equals("trouser"))
				   System.out.println("Standard Deviation: "+object.standardDeviation(object.getTrouser()));
				if(in.equals("pullover"))
				   System.out.println("Standard Deviation: "+object.standardDeviation(object.getPullover()));
				if(in.equals("dress"))
				   System.out.println("Standard Deviation: "+object.standardDeviation(object.getDress()));
				if(in.equals("boot"))
				   System.out.println("Standard Deviation: "+object.standardDeviation(object.getBoot()));
			}
			if(in.equals("ac")){
			   System.out.println("Type getTee(), getTrouser(), getPullover(), getDress(), getCoat(), getSandal(), getShirt(), getSneaker(), getBag(), or getBoot()");
			   in = scan.nextLine();
			   ArrayList<Integer> ac = new ArrayList<Integer>();
				if(in.equals("getTee()") 
				   ac = object.getTee();
				if(in.equals("getTrouser()") 
				   ac = object.getTrouser();
				if(in.equals("getPullover()") 
				   ac = object.getPullover();
				if(in.equals("getDress()") 
				   ac = object.getDress();
				if(in.equals("getCoat()") 
				   ac = object.getCoat();
				if(in.equals("getSandal()") 
				   ac = object.getSandal();
				if(in.equals("getShirt()") 
				   ac = object.getShirt();
				if(in.equals("getSneaker()") 
				   ac = object.getSneaker();
				if(in.equals("getBag()") 
				   ac = object.getBag();
				if(in.equals("getBoot()") 
				   ac = object.getBoot();
			   for(Integer pr : ac) {
			   	System.out.print(pr + " ");
			   }
			}
			if(in.equals("mu")){
			   System.out.println("Type addToTee(), addToTrouser(), addToPullover(), addToDress(), addToCoat(), addToSandal(), addToShirt(), addToSneaker(), addToBag(), or addToBoot()");
			   in = scan.nextLine();
				if(in.equals("addToTee()") 
				   object.addToTee();
				if(in.equals("addToTrouser()") 
				   object.addToTrouser();
				if(in.equals("addToPullover()") 
				   object.addToPullover();
				if(in.equals("addToDress()") 
				   object.addToDress();
				if(in.equals("addToCoat()") 
				   object.addToCoat();
				if(in.equals("addToSandal()") 
				   object.addToSandal();
				if(in.equals("addToShirt()") 
				   object.addToShirt();
				if(in.equals("addToSneaker()") 
				   object.addToSneaker();
				if(in.equals("addToBag()") 
				   object.addToBag();
				if(in.equals("addToBoot()") 
				   object.addToBoot();
			}
			if(in.equals("ts")){
			   object.toString();
			}
	}

}
