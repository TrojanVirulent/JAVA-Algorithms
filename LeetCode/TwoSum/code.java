class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j, s = nums.length;
        int a[] = new int[2];
        for (int  i=0; i< s-1; i++)
        {
            for(j=i+1; j<s; j++)
            {
                if ((nums[i]+nums[j]) == target)
                {
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            
            }
        }
        return a;
    }
}