import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    int n1 = input.nextInt();
    int n2 = input.nextInt();
    int div = n1 / n2;
    System.out.println("Divide :: "+ div);
  }
}
