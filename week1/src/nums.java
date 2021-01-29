import java.util.Scanner;
public class nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        int zeros = 0;
        cnt=in.nextInt();
        if(cnt >0) {
            int[] nums = new int[cnt];
            for(int i=0;i<cnt;i++)
            {
                nums[i]=in.nextInt();

            }
            for(int j=0;j<cnt;j++)
            {
                if(nums[j]==0)
                {
                    zeros++;
                }
                else
                {
                    nums[j-zeros]=nums[j];
                    nums[j]=0;
                }
            }
            for(int k=0;k<cnt;k++)
            {
              System.out.print(nums[k]+" ");

            }
        }
    }
}
