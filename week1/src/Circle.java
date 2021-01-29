
import java.util.Scanner;

public class Circle {
    private static final double PI =3.1415926 ;
    Scanner in = new Scanner(System.in);
    private double radius=0;
    private double area=0;
    private double perimeter=0;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
      area=PI*Math.pow(radius,2);
      return area;
    }
    public double getPerimeter(){
        perimeter=2*PI*radius;
        return perimeter;
    }
public static void main(String[] args){
        Circle c=new Circle(3);
        System.out.printf("the area is%.2f\n",c.getArea());
        System.out.printf("the perimeter%.2f",c.getPerimeter());
}
}
