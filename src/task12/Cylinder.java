package task12;

public class Cylinder extends Circle{
    public double height;
    public Cylinder(){
        super();
        this.height=1.0;
        System.out.println("Construced a Cylinder with Cylinder()");
    }
    public Cylinder(double height){
        super();
        this.height=height;
        System.out.println("Construced a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height,double radius){
        super(radius);
        this.height=height;
        System.out.println("Construced a cirle with circle(height,radius)");
    }
    public Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height=height;
        System.out.println("Construced a cirle with circle(height,radius,color)");
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public  double getVolume(){
        return getArea()*height;
    }
    @Override
    public String toString() {
        return "This is a Cylinder";
    }

    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        System.out.println("Radius is : "+cyl.getRadius()
                +",Height is " +cyl.getHeight()
                +",Color is " +cyl.getColor()
                +",Base area  is " +cyl.getArea()
                +",Volumn is " +cyl.getVolume());
        Cylinder cyl2 = new Cylinder(5.0,2.0);
        System.out.println("Radius is "+cyl2.getRadius());


    }
}
