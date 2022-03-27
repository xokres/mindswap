package academy.mindswap.non_static_inner_classes.local_class;

// A REAL LIFE EXAMPLE OF HOW TO USE A LOCAL CLASS
public class Person {

    private Arm leftArm;
    private Arm rightArm;

    public Person() {
        this.leftArm = new Arm();
        this.rightArm = new Arm();
    }

    public void bendArms() {
        leftArm.move();
        rightArm.move();
    }

    private class Arm {

        public void move() {

            class Elbow {
                public void bend() {
                    System.out.println("Elbow bending");
                }
            }

            new Elbow().bend();
            System.out.println("Arm bending.");
        }
    }
}
