import java.util.Scanner;
public class Complex {
    private double real;
    private double image;
    public Complex()
    {
        real=0;
        image=0;
    }
    public Complex(double r,double i)
    {
        real=r;
        image=i;
    }
    Complex add(Complex c){
        Complex a= new Complex();
        a.real=real+c.real;
        a.image=image+c.image;
        return a;
    }
    Complex minus(Complex c){
        Complex a= new Complex();
        a.real=real-c.real;
        a.image=image-c.image;
        return a;
    }
    Complex multiply(Complex c){
        Complex a= new Complex();
        a.real=real*c.real-image*c.image;
        a.image=image*c.real+real*c.image;
        return a;
    }
    String tostring(){
        String a="0";
        if(image>=0&&image!=1){
            a=(int)real+"+"+(int) image+"i";
        }
        else if(image==1)
        {
            a=(int)real+"+"+"i";
        }
        else if(image==-1)
        {
            a=(int)real+"-"+"i";
        }
        else{
        a=(int)real+""+(int)image+"i";
        }
        return a;
    }
    public  static void main(String[] args){
        Scanner x=new Scanner(System.in);
        double a= x.nextDouble();
        double b=x.nextDouble();
        double c=x.nextDouble();
        double d=x.nextDouble();
        Complex one=new Complex(a,b);
        Complex two=new Complex(c,d);
        System.out.println("两复数相加的结果为："+one.add(two).tostring());
        System.out.println("两复数相减的结果为："+one.minus(two).tostring());
        System.out.println("两复数相乘的结果为："+one.multiply(two).tostring());
    }
}
