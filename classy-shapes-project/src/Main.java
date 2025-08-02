public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Circle circle = new Circle(4.0);
        double areaOfRectangle=ShapeMetricCalculator.calculateRectangleArea(rectangle);
        double areaOfCircle=ShapeMetricCalculator.calculateCircleArea(circle);
        System.out.println("Area of rectangle: "+areaOfRectangle);
        System.out.println("Area of Circle: "+areaOfCircle);
    }
}
