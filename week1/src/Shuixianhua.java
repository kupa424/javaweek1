
public class Shuixianhua {
    public static void main(String[] args) {
        int amount=1000;
        int cnt=0;
        for(int hundred=1;hundred<10;++hundred)
        {
            for (int ten=0;ten<10;++ten)
            {
                for(int one=0;one<10;++one)
                {
                    if(Math.pow(hundred,3)+Math.pow(ten,3)+Math.pow(one,3)==hundred*100+ten*10+one)
                    {
                        cnt++;

                    }
                }
            }
        }
System.out.println(cnt);
    }
}
