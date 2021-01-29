import java.util.Scanner;
public class fanzhuan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      int length=s.length();
      String r="";
      for(int i=0;i<length;i++)
      {
          r=s.charAt(i)+r;
      }
      System.out.println(r);
    }
}
