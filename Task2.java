import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your Sapid:");
    int id = scanner.nextInt();

    System.out.print("Enter your Enrollment NO.:");
    int rollno = scanner.nextInt();

    System.out.print("Enter branch Name:");
    int branch = scanner.nextInt();

   // int maths = 27;
    //int chemistry = 53;
    //int physics = 65;
    //int english = 81;
    //int physcaleducation = 86;

    int marks = 312;
    double parc = marks/100;
    

    if(parc<100 || parc>=95){
    System.out.print("A+");
    }
    else if(parc<95 || parc>=85){
    System.out.print("A");
    }

    else if(parc<85 || parc>=75){
    System.out.print("B+");
    }

    else if(parc<75 || parc>=70){
        System.out.print("B");

    }


else if(parc<70 || parc>=65){
    System.out.print("c");

}

else if(parc<65 || parc>=60){
    System.out.print("D");
}
else{
    System.out.print("Fail");
}


}
}