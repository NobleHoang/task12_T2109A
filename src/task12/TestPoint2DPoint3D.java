package task12;
public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(1,2);
        System.out.println(p2);
        Point2D p21 = new Point2D();
        System.out.println(p21);
        p2.setX(3);
        p2.setY(4);
        System.out.println(p2);
        System.out.println("x is : "+p2.getX(21));
        System.out.println("y is : "+p2.getY(22));
        Point3D p3 = new Point3D(11,12,13);
        System.out.println(p3);
        Point3D p31 = new Point3D();
        System.out.println(p31);
        p3.getX(21);
        p3.getY(22);
        p3.getZ(23);
        System.out.println(p3);
        System.out.println("x is : "+p3.getX(21));
        System.out.println("y is : "+p3.getY(22));
        System.out.println("z is : "+p3.getZ(23));

    }
}
