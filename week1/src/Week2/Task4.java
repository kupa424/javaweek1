package Week2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Game g=new Game();
        int number=g.v;
        int a;
        do {
            a = in.nextInt();
            if (a > number) {
                System.out.println("猜大了噢，再试一下吧！");
            } else if (a < number) {
                System.out.println("猜的有点小，再试一下吧！");
            }
        } while (a != number);
        System.out.println("恭喜你，猜对了！" );
    }
    public static class Game{
        int v=100;
    }
}