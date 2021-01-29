import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double kg;
        double m;
        double BMI=0;
        kg=in.nextDouble();
        m=in.nextDouble();
        BMI=kg/Math.pow(m,2);
        if(BMI<18.5)
        {
            System.out.println("过轻");
        }
        else if(BMI>=18.5&&BMI<25)
        {
            System.out.println("正常");
        }
        else if(BMI>=25&&BMI<28)
        {
            System.out.println("过重");
        }
        else if(BMI>=28&&BMI<32)
        {
            System.out.println("肥胖");
        }
        else
        {
            System.out.println("非常肥胖");
        }
    }
}
