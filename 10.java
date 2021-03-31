import java.util.Scanner;

public class DecimalToOctalExample1{  
public static void main(String args[]){  
    Scanner input = new Scanner (System.in);
    System.out.print("Input a Decimal Number please :: ");
    int num = input.nextInt();
    System.out.println("Octal number  :: "+Integer.toOctalString(num));  
  
}}  
