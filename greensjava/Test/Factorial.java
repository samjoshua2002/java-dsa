package greensjava.Test;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        long mul = 1;
        while (n > 0) {
            mul *= n;
            n--;
        }
        System.out.println(mul);

    }


}