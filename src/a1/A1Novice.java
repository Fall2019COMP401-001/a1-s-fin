package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int totalcustomers = scan.nextInt();
		
		String[] names = new String[totalcustomers];
		double[] totalcost = new double[totalcustomers];
		String food = "";
		
		for (int i=0; i<totalcustomers; i++) {
			
			names[i] = scan.next().charAt(0) +". " + scan.next();
		    
			int numberitems = scan.nextInt();
			
			double sum = 0;
			
			for (int a=0; a<numberitems; a++) {
				
				int quantity = scan.nextInt();
			    food = scan.next();
			    sum += quantity * scan.nextDouble();
	   
	        }
			totalcost[i] = sum;
		}
			
		scan.close();
		
		for (int x=0; x<totalcustomers; x++) {
			String stc = String.format("%.2f", totalcost[x]);
			System.out.println(names[x] + ": " + stc);
		}
	
    }
}
