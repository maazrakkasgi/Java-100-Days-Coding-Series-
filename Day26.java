// Write a program to calculate Maximum number of handshakes

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people in the group: ");
        int n = scanner.nextInt();

        int maxhandshake=n*(n-1)/2;
        System.out.print("The Maximum no of handshake is  "+ maxhandshake);
    }
}
