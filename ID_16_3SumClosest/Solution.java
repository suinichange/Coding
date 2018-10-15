package ID_16_3SumClosest;

import java.util.Arrays;

public class Solution {
    /*
    直接遍历所有情况，求出所有三个数的和目标值进行比较，选取绝对值最小（也就是所谓的最接近）
    时间复杂度：O(N^3),数据量大容易超时
    Leetcode Runtime:168 ms
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int length=nums.length;
        int result=nums[0]+nums[1]+nums[2];
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                for(int k=j+1;k<length;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    if(Math.abs(sum-target)<Math.abs(result-target)){
                        result=sum;
                    }
                }
            }
        }
        return result;
    }
}
