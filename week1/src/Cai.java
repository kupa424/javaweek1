import java.util.Scanner;
public class Cai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int number=(int) (Math.random()*100+1);
//        int a;
//        int count=0;
//        do {
//            a=in.nextInt();
//            count=count+1;
//            if(a>number)
//            {
//                System.out.println("偏大");
//            }
//            else if(a<number)
//            {
//                System.out.println("偏小");
//            }
//        }while(a!=number);
//        System.out.println("恭喜你猜对了，你猜了"+count+"次");
  //      String s1="abc";
//        String s2="abcd";
////        System.out.println("abcd".compareTo(s2));
 //        System.out.println(s1.charAt(0));
        String s1="0123A56389汉字";
        //System.out.println(s1.substring(2,4));
        int loc=s1.indexOf('3');
        System.out.println(s1.indexOf('3',loc+1));
        System.out.println(s1.indexOf("A56"));
        //abs绝对值  round四舍五入 random给随机数 pow算幂值
    }
}

