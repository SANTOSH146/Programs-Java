package DSA;
import java.util.*;

class TwoSum{
    public int[] twoSum(int[] arr,int target){
        int[] result=new int[2];

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,7};
        TwoSum goal=new TwoSum();
        System.out.println(Arrays.toString(goal.twoSum(arr,10)));

    }
}

// TC-O(n^2)
// SC-O(n)
// APP-Brute Force