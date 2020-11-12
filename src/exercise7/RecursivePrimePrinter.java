package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
      for (int z = n; z>0;z--) {
        if (isPrime(z) = true) {
          System.out.println(z);
        }
      }
    }

    public static boolean isPrime(int n) {
      boolean isPrime = true;
      if (n%2==0) {
        isPrime = false;
      }else {
        isPrime = true;
      }
        return prime;
    }
}
