public class Circle implements GeometricObject {
    double radius=5.0;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public double getArea() {
        return Math.PI*(radius*radius);
    }
    public String toString(){
        return String.format("The Perimeter of the Circle = %.2f\nThe Area of the Circle = %.2f",getPerimeter(),getArea());
    }
    
}
