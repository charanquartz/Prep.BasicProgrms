import java.util.*;

public class PrimeNumberorNot {
  public static void main(String[] args) {
    Scanner r = new Scanner(System.in);
    System.out.println("Enter a number to check :");
    int n = r.nextInt();
    int count = 0;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    if (n < 0) {
      System.out.println("Prime numbers are positive integers");
    } else {
         if (n == 1 || n == 0) {
            System.out.println("0,1 is not nothing");
         } else {
              if (count == 0) {
               System.out.println("Prime");
                } else{
                System.out.println("Not Prime/Composite number");
        }
      }
    }
  }
}