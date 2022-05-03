package task12;

public class Circle {
    private double radius;
    private String color;
    public Circle(){
    this.color= "red";
    this.radius=1.0;
        System.out.println("Construced a cirle with circle()");
    }
    public Circle(double radius){
        this.radius=radius;
        this.color="red";
        System.out.println("Construced a cirle with circle(radius)");
    }
    public Circle(double radius,String color){
        this.color=color;
        this.radius=radius;
        System.out.println("Construced a cirle with circle(radius,color)");
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" +radius+ ",color="+ color+ "]";
    }
    public double getArea(){
        return  radius*radius*Math.PI;
    }
}
