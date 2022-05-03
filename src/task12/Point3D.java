package task12;

public class Point3D extends Point2D{
    private int z;
    public Point3D(){
        super();
        this.z=0;
    }
    public Point3D(int x,int y,int z){
        super(x,y);
        this.z=z;
    }

    public int getZ(int i) {
        return this.z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+super.getX(21)+","+super.getY(22)+","+this.z+")";
    }
}
