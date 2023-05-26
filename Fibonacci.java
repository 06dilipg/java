import java.util.Scanner;
public class FibonacciNumbers{
 public static void main(String[] args) {
 Scanner in = new Scanner (System.in);
 System.out.println("Enter the 1st Number");
 int n = in.nextInt();
 System.out.println("Enter the 2nd Number");
 int a = in.nextInt();
 System.out.println("Enter the 3rd Number");
 int b = in.nextInt();
 int count = 2;
 while(count <= n){
 int temp = b;
 b = b+a;
 a = temp;
 count++;
 }
 System.out.println(b);
 }
} 
