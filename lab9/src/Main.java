import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter existing file name: ");

            //writing in the file
            String filename = sc.nextLine();
            FileWriter fw = new FileWriter(filename,true);
            fw.write(roll+" "+name+" "+subject+" "+marks+"\n");
            fw.close();

            //reading the file
            System.out.println("\n--- File Content ---");
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        } catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        sc.close();
    }
}
