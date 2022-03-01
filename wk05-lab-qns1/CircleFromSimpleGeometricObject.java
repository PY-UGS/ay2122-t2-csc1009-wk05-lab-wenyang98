

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double radius;

    public CircleFromSimpleGeometricObject() {
    }

    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }
    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getDiameter(){
        return radius * 2;
    }
    public double getPerimeter(){
        return radius * Math.PI * 2;
    }
    public void printCircle(){
    }

}
