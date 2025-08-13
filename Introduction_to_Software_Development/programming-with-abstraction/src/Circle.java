public class Circle extends Shape {
    private float radius;

    Circle(float r){
        this.radius = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius: " + radius);
    }

    @Override
    public float calculateArea() {
        float area = (float)Math.PI*this.radius*this.radius;
        return area;
    }

    @Override
    float calculatePerimeter() {
        float perimeter = 2*(float)Math.PI*this.radius;
        return perimeter;
    }
}
