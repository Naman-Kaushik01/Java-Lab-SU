package vegetablesCellingSoftware;

import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		
		System.out.println("Enter the no of items");
		Scanner Sc = new Scanner(System.in);
	    int itemCount = Sc.nextInt();
	    System.out.println(itemCount);
	    
//	   
	    
	    int id []= new int[itemCount];
	    int quant []= new int[itemCount];
	    String des[]=new String[itemCount];
	    float rate[]= new float[itemCount];
	   
	    
	    
	    for(int i=0; i<itemCount;i++) {
	    	System.out.println("Enter Product id");
	    	  id[i] =Sc.nextInt();
	    	System.out.println("Enter Quantity");
	    	  quant[i] =Sc.nextInt();
	    	System.out.println("Enter item name");
	    	  des[i] = Sc.next();
	    	 System.out.println("Enter Rate");
	    	 rate[i]= Sc.nextFloat();
	    	
	   }
	    
   	 for(int j=0;j<itemCount;j++) {
   		  System.out.println(id[j] +" "+quant[j]+ " "+des[j] + " Rate: "+rate[j]);
   	  }
   	 
   	 System.out.println("Customer buy module");
   	 System.out.println("How many items you want to buy");
   	 int cItem = Sc.nextInt();
   	 float bill=0.0f;
   	 
   	 
   	 
   	 if(cItem<=itemCount) {
   		 
   	 for(int i=0;i<cItem;i++) {
   		 System.out.println("Enter product id");
   		 int cid = Sc.nextInt();
   		 System.out.println("Enter quantity");
   		  int cquan= Sc.nextInt();
   		 
   
   		 if(cquan<=quant[cid-1]) {
   		 bill= bill+cquan*rate[cid-1];
   		 
   	 }
   		 else {
   			 System.out.println("Insufficeint items");
   		 }
  }
}
   	 else {
   		 System.out.println("Please enter valid item.");
   	 }
   	System.out.println("Final bill: " + bill);
   	 
   		 
   	 }
   	 }


