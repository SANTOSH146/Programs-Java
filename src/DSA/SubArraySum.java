
package DSA;
import java.util.*;

public class SubArraySum {
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int max_sum=Integer.MIN_VALUE;    

        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            max_sum=Math.max(sum,max_sum);
            if (sum<0){
                sum=0;
            }
        }
        return max_sum;
        
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        System.out.println(maxSubArray(nums));

    }
    
}
