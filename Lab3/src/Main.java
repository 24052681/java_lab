import java.util.Scanner;


class Plastic2D {
    double length, width;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
    }

    void cost2D() {
        double area = length * width;
        double cost = area * 40;
        System.out.println("Cost of 2D Sheet = Rs " + cost);
        hello
    }
}


class Plastic3D extends Plastic2D {
    double height;

    void getData3D() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    void cost3D() {
        double volume = length * width * height;
        double cost = volume * 60;
        System.out.println("Cost of 3D Box = Rs " + cost);
    }
}

public class Main {
    public static void main(String[] args) {
        Plastic3D p = new Plastic3D();
        p.getData();
        p.getData3D();
        p.cost2D();
        p.cost3D();
    }
}
