package hw1;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Area rectangle = new Area();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        
        rectangle.setDim(length,width);
        System.out.println("Area of rectangle: " +rectangle.getArea());
        sc.close();
    }
}
