package tp1.shapes;

public class Rectangle {
    public int a;
    public int b;

    //methods
    public void perimeter(int a,int b){
        this.a=a;
        this.b=b;
        int p=(a+b)*2;
        System.out.println("Perimeter : "+p);
    }

    public void surface(int a,int b){
        this.a=a;
        this.b=b;
        double s=a*b;
        System.out.println("Surface : "+s);
    }
}
