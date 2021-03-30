import java.util.Scanner;

public class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    int n1 = input.nextInt();
    int n2 = input.nextInt();
    int n3 = input.nextInt();
    int avg = (n1+n2+n3)/3;
    System.out.println("Average  :: "+ avg);
  }
}
