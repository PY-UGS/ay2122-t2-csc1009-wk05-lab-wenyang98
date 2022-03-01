public class Square extends Shape{
    private double length1;
    private double length2;

    public Square(){

    }
    public Square(double length1, double length2){
        super();
        this.length1 = length1;
        this.length2 = length2;
    }
    @Override
    public double area(){
        System.out.println("Inside Area for Square.");
        return length1 * length2;
    }

}
