import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);


    System.out.print("Enter the Principle value: ");
    Double Principle = scanner.nextDouble();


    System.out.print("Enter the Rate of Interest: ");
    Double Rate = scanner.nextDouble();

    System.out.print("Enter the Time (in  year): ");
    Double Time = scanner.nextDouble();


    Double SimpleInterest = (Principle * Rate * Time) / 100;

    System.out.print(SimpleInterest);
    scanner.close();

    }
}