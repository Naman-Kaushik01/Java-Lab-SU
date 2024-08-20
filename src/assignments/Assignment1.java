package assignments;
import java.util.Scanner;

class Sum{
	public int sum(int a,int b) {
		int sum;
		sum=a+b;
		return sum;
	}
}
public class Assignment1 {
        public static void main(String[]args) {
           Sum s1= new Sum();
           Scanner sc = new Scanner(System.in);

           System.out.println("Enter any two numbers :");
           int a=sc.nextInt();
           int b=sc.nextInt();
           
//           s1.sum(a, b);
           System.out.println("The sum is: "+ s1.sum(a, b));
           
           
           
           
           //           s1.sum(2, 5);
//           System.out.println("Hello");
//           System.out.println(s1.sum(5, 7));
        }
}
