package ID_16_3SumClosest;

import java.util.Arrays;

public class Solution2 {
    /*
    先对数组进行排序，再对数组进行遍历.
    当总和小于目标值，说明我们要加一个更大的数才能靠近目标值。
    当总和大于目标值，说明我们要加一个更小的数才能靠近目标值。
    而由于数组有序，最小和最大的数在两端，我们先固定一个元素（nums[i]），然后从两端遍历进行求和比较即可。
    时间复杂度：O(N^2)
    Leetcode Runtime:13 ms
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length=nums.length;
        int result=nums[0]+nums[1]+nums[length-1];
        for(int i=0;i<length-2;i++)
        {
            int start=i+1;
            int end=length-1;
            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(sum>target){
                    end--;
                }else{
                    start++;
                }
                if (Math.abs(sum-target)<Math.abs(result-target)){
                    result=sum;
                }
            }
        }
        return result;
    }
}
