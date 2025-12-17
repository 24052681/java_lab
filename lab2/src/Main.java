//Accept 10 numbers from command line and check how many of them are even and how many are odd.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the number " + (i+1) + " : ");
            nums[i] = sc.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 10; i++) {
            if(nums[i] % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println(even + " even number is present.");
        System.out.println(odd + " odd number is present.");

    }
}