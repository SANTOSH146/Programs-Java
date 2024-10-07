package DSA;
import java.util.*;

class TwoSumOptimized{
    
    public int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> hmap=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int compliment=target-arr[i];

            if(hmap.containsKey(compliment)){
                return new int[] {hmap.get(compliment),i};
            }
            hmap.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,7};
        TwoSumOptimized goal=new TwoSumOptimized();
        System.out.println(Arrays.toString(goal.twoSum(arr,14)));
    }
}

// TC-O(n)
// SC-O(n)
// APP-Hashing-based Algorithm