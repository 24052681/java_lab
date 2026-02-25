/*
Define an interface with three methods – earnings(), deductions() and bonus() and define a Java class ‘Manager’ which uses this interface without implementing bonus() method. Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements bonus() method.  Write the complete program to find out earnings, deduction and bonus of a sbstaff with basic salary amount entered by the user as per the following guidelines –
earnings basic + DA (80% of basic) + HRA (15% of basic) deduction PF 12% of basic bonus 50% of basic
 */

import java.util.Scanner;


interface Salary {
    void earnings();
    void deductions();
    void bonus();
}


abstract class Manager implements Salary {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    public void earnings() {
        double earnings = basic + (0.80 * basic) + (0.15 * basic);
        System.out.println("Earnings - " + earnings);
    }

    public void deductions() {
        double deduction = 0.12 * basic;
        System.out.println("Deduction - " + deduction);
    }
}


class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    public void bonus() {
        double bonus = 0.50 * basic;
        System.out.println("Bonus - " + bonus);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary - ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);
        s.earnings();
        s.deductions();
        s.bonus();
    }
}
