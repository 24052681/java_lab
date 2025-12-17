//Write a program in Java to take first name and last name from user and print both in one line as last name followed by first name

import java.util.Scanner;
public class ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = sc.nextLine();

        System.out.print("Enter second name: ");
        String last = sc.nextLine();

        System.out.println("Output: " + first + " " + last);
        }

}
