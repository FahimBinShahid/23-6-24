public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        System.out.println("Circle Area =" + circle.getArea());
        Cylinder cylinder = new Cylinder(4,6);
        System.out.println("Cylinder area=" + cylinder.getArea());
        System.out.println("Cylinder volume="+ cylinder.getVolume());



    }
}