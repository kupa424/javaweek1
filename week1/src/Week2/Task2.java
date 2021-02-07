package Week2;

public class Task2{
    public static void main(String[] args) {
        String str1[]={"flower","flow","flight"};
        System.out.println("“"+longest(str1)+"”");
        String str2[]={"dog","racecar","car"};
        System.out.println("”"+longest(str2)+"“");
    }
       public static String longest(String[] strs){
        if(strs.length==0){
            return "";
        }
           int min=strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            min=Math.min(min,strs[i].length());}
        for (int i = 0; i < min; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i)!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
            }
        }
        }
        return strs[0].substring(0,min);
    }
}
