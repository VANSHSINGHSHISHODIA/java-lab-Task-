import java.util.Scanner;
class areaoftriangle {
    public static void main(String[] args){
    Scanner abc = new Scanner(System.in);

//If user have all the sides of the triangle
    System.out.print("Enter the first side of triangle: ");
    Double a = abc.nextDouble();

    System.out.print("Enter the second side of triangle: ");
    Double b = abc.nextDouble();

    System.out.print("Enter the third side of triangle: ");
    Double c = abc.nextDouble();

    if( a + b > c && b + c > a && a + c > b ) {

    double s =(a + b +c) / 2;

    Double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    System.out.println("Area of triangle"+area);
    } 
    else{
        System.out.print("Entered values are incorrect: ");
    }
    
    

    // If user have base and height of triangle

    System.out.print("Enter the base of triangle: ");
    Double Base = abc.nextDouble();

    System.out.print("Enter the height of triangle: ");
    Double Height = abc.nextDouble();

    Double Area = 0.5 * Base * Height;
    System.out.println(Area);
    {
        abc.close();
    }
}
}