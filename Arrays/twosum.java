package Arrays;

import java.util.Arrays;

//import java.util.ArrayList;
//import java.util.List;

//import javax.management.openmbean.ArrayType;


public class twosum{
    public static void main(String[] args) {
        Solution obj=new Solution();
        int nums[]={2,7,11,15};

System.out.println(Arrays.toString(obj.twoSum(nums, 9)));

        

    }
}class Solution {
    public int [] twoSum(int []nums, int target) {
        int []updated=new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    updated[0]=i;
                    updated[1]=j;
                }
            }
        }
        return  updated;
    }
}
