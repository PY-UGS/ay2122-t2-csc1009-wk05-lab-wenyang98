public class Circle extends Shape{
    private double radius1, radius2;

    public Circle(){
    }
    public Circle(double radius1, double radius2){
        super();
        this.radius1 = radius1;
        this.radius2 = radius2;
    }
    @Override
    public double area(){
        System.out.println("Inside Area for Circle.");
        return pi * radius1 * radius2;
    }
}
