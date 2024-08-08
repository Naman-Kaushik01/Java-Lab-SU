package lab5;

import java.util.Scanner;

public class Test1 {
 
 public static void main(String[]args)
 {

	 System.out.println("Enter Start Range and End Range :");
	 Scanner sc= new Scanner(System.in);
	 int sr = sc.nextInt();
     int er = sc.nextInt(); 
     int a=0,b=0,c=0;
     
     int e=0;
     
     for(int i=sr;i<=er;i++) {
    	
    	 if(i%2==0) {
    		 a++;
    		 e++;
//    		 System.out.println("Divided by 2 :" + i);
    	 }
     }
     System.out.println("Using single variable /2: "+e);
     e=0;
    	 for(int i=sr;i<=er;i++) {
    		 if(i%3==0) {
        		 b++;
        		 e++;
//        		 System.out.println("Divided by 3 :" + i);
        	 }
    		 
    	 }
    	 System.out.println("Using single variable /3 : "+e); 
    	 e=0;
    	 for(int i=sr;i<=er;i++) {
    		 
    	if(i%4==0) {
    		 c++;
    		 e++;
//    		 System.out.println("Divided by 4 :" + i);
    	 }
     } 
    	
    	 System.out.println("Using single variable /4 : "+e); 
    	 e=0;
    	 
     
     System.out.println("The total number divisible by 2 using diff. variables :" + a);
     System.out.println("The total number divisible by 3 using diff. variables :" + b);
     System.out.println("The total number divisible by 4 using diff. variables :" + c);
 }
}
