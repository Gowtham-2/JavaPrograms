abstract class Shape{
    public abstract double calculateArea();

    public  abstract double calculatePerimeter();
}
interface ShapeInterface{
    double calculateArea();
    double calculatePerimeter();
}
class Circle extends Shape{
    private final double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
class Square implements ShapeInterface{
    private double side;
    public Square(double side){
        this.side=side;
    }
    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }
}
public class AbstractAndInterface {
    public static void main(String[] args) {
        Shape circle=new Circle(5);
        System.out.println("Circle Area:"+circle.calculateArea());
        System.out.println("Circle Perimeter:"+circle.calculatePerimeter());

        ShapeInterface square=new Square(4);
        System.out.println("Square Area:"+square.calculateArea());
        System.out.println("Square Perimeter:"+square.calculatePerimeter());
    }
}
