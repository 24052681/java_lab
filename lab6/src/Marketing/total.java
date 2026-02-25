package Marketing;

import java.util.Scanner;

public class total {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id: ");
        int empid = sc.nextInt();
        System.out.println("Enter the employee name: ");
        String ename = sc.next();
        System.out.println("Enter the employee's basic salary: ");
        double basic = sc.nextDouble();
        sales s1 = new sales(empid, ename, basic);

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("The employee id is: " + empid);
        System.out.println("The total is: " + s1.tallowance());
    }

}
