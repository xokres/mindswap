package academy.mindswap.shapes;

public class Circle extends GeometricShape {

    public Circle(int area) {
        super(area);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void fill() {
        System.out.println("Filling a circle");
    }
}
