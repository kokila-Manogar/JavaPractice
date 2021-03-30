import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Number 1 please :: ");
    int n1 = input.nextInt();
    System.out.print("Number 2 please :: ");
    int n2 = input.nextInt();
    int sum = n1 + n2;
    System.out.println("Sum: "+sum);
  }
}
