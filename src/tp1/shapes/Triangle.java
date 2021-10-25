package tp1.shapes;

import java.lang.Math;


public class Triangle {
    public int a;
    public int b;
    public int c;

    //methods
    public void perimeter(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        int p=a+b+c;
        System.out.println("Perimeter : "+p);
    }

    public void surface(int a,int b, int c){
        double p;
        this.a=a;
        this.b=b;
        this.c=c;
        p=(a+b+c)/2;
        double s=Math.sqrt(p*((p-a)*(p-b)*(p-c)));
        System.out.println("Surface : "+s);
    }
