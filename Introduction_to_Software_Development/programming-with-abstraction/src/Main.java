import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculating Area of Rectangle:");
        System.out.print("Enter width: ");
        float width = scanner.nextFloat();
        System.out.print("Enter height: ");
        float height = scanner.nextFloat();
        Rectangle rectangle = new Rectangle(width, height);
        rectangle.draw();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
        System.out.println("\n\nCalculating Area of Circle:");
        System.out.print("Enter radius: ");
        float r = scanner.nextFloat();
        Circle circle = new Circle(r);
        circle.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());
    }
}
