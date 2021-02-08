package Week2;
import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        String str1 = "233hello15aop999";
        String str2 = "a1bcd222efg";
        String str3 = "I like java";
        str3 = str3.trim();

        System.out.println("["+number(str1)+"]");
        System.out.println("["+number(str2)+"]");
        System.out.println("["+number(str3)+"]");

    }


        public static String number(String str1){
            String str = "";
            if (str1 != null) {
                for (int i = 0; i < str1.length(); i++) {
                    if (str1.charAt(i) >= 48 && str1.charAt(i) <= 57) {
                        str += str1.charAt(i);
                    }
                }
            }
            return str;
    }
}
