public class Cube implements GeometricObject {
    double length=3.0;
    public Cube(double length){
        this.length=length;
    }
    @Override
    public double getPerimeter() {
        
        return 12*length;
    }
    @Override
    public double getArea() {
       
        return 6*(length*length);
    }
    public String toString(){
        return String.format("The Perimeter of the Cube = %.2f\nThe Area of the Cube = %.2f",getPerimeter(),getArea());
    }
    
    
    
}
