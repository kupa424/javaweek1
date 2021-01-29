
import java.util.Scanner;
public class Sushu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        for(int n=2;n<100;n++) {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n+" ");
            } else {
//                System.out.println(n + "不是素数");
            }
        }
    }
}
