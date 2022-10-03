//Write a program with a method named getTotal that accepts two integers as an argument and return its sum.
// Call this method from main( ) and print the results.

import java.util.*;

public class JustASum {

    public static int getTotal(int x, int y){
        int total = x + y;
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first integer: ");
        int x =  input.nextInt();

        System.out.println("Enter a second integer: ");
        int y = input.nextInt();

        System.out.println(getTotal(x, y));
    }
}
