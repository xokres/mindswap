package academy.mindswap.shapes;

import academy.mindswap.Drawable;
import academy.mindswap.Fillable;

public abstract class GeometricShape  implements Fillable, Drawable {

    private int area;

    public GeometricShape(int area) {
        this.area = area;
    }
 /*
    @Override
    public void fill() {
        System.out.println("Filling the shape");
    }
    */
    @Override
    public void erase() {
        System.out.println("Erasing the shape");
    }

    public  void color(){
        System.out.println("Coloring the shape");
    }

}
