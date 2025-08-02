public class Rectangle extends Shape {
    private float width;
    private float height;

    Rectangle(float w, float h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width: " + width + " and height: " + height);
    }

    @Override
    public float calculateArea() {
        float area = this.width * this.height;
        return area;
    }

    @Override
    float calculatePerimeter() {
        float perimeter = this.width+this.width+this.height+this.height;
        return perimeter;
    }
}
