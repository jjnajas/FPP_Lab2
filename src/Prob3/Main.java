package Prob3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter C for Circle");
            System.out.println("Enter R for Rectangle");
            System.out.println("Enter T for Triangle");
            choice = input.nextLine().toUpperCase();
            if (choice.equals("C")) {
                System.out.print("Enter the radius of the Circle: ");
                double radius = input.nextDouble();
                input.nextLine();
                Circle circle = new Circle(radius);
                System.out.printf(
                        "The area of Circle is :",
                        circle.computeArea()
                );
            } else if (choice.equals("R")) {
                System.out.print("Enter the width of the Rectangle: ");
                double width = input.nextDouble();
                System.out.print("Enter the height of the Rectangle: ");
                double length = input.nextDouble();
                input.nextLine();
                Rectangle rectangle = new Rectangle(width, length);
                System.out.printf(
                        "The area of Rectangle is :",
                        rectangle.computeArea()
                );
            } else if (choice.equals("T")) {
                System.out.print("Enter the base of the Triangle: ");
                double base = input.nextDouble();
                System.out.print("Enter the height of the Triangle: ");
                double height = input.nextDouble();
                input.nextLine();
                Triangle triangle = new Triangle(base, height);
                System.out.printf(
                        "The area of Triangle is : ",
                        triangle.computeArea()
                );
            } else {
                System.out.println("Invalid choice.");
            }
            System.out.print("Do you want to continue (y/n): ");
            choice = input.nextLine().toLowerCase();
        } while (choice.equals("y"));
        input.close();
    }
}
