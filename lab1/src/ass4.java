//Program to check a user entered number is palindrome or not

import java.util.Scanner;

public class ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (original == rev) {
            System.out.println(original + " is a Palindrome");
        }
        else{
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}
