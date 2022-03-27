package academy.mindswap.shapes;

public class Square extends GeometricShape{

    public Square(int area) {
        super(area);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
