import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number= in.nextInt();
        int count = 0;
        do
        {
    number = number / 10;
    count++;
    System.out.println("number="+number+";count="+count);
    }while(number > 0);
        System.out.println(count);
    }
}
