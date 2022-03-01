public class Ellipse extends Shape{
    private double a, b;

    public Ellipse(){

    }
    public Ellipse(double a, double b){
        super();
        this.a = a;
        this.b = b;
    }
    @Override
    public double area(){
        System.out.println("Inside Area for Ellipse.");
        return pi * a * b;
    }
    
}
