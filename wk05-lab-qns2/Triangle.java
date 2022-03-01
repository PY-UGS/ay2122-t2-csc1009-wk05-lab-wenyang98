public class Triangle extends Shape{
    private double base, height;

    public Triangle(){

    }
    public Triangle(double base, double height){
        super();
        this.base = base;
        this.height = height;
    }
    @Override
    public double area(){
        System.out.println("Inside Area for Triangle.");
        return (base * height) / 2;
    }
}
