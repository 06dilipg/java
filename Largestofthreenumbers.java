import java.util.Scanner;
public class LrgestOfThree {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter 1st number :");
 int a = in.nextInt();
 System.out.println("Enter 2nd number :");
 int b = in.nextInt();
 System.out.println("Enter 3rd number :");
 int c = in.nextInt();
 int max = a;
 if(b>max){
 max = b;
 }
 if (c > max){
 max = c;
 }
 System.out.println("The largest of three numbers is:" +max);
 }
} 
