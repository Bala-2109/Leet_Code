class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]+1!=nums[i])
            {
                return nums[i]-1;
            }
            j++;
        }
        if(nums[0]!=0)
        {
            return 0;
        }
        return nums[j]+1;
    }
}