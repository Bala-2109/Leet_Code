class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hset=new HashSet<>();
        for(int num:nums)
        {
            hset.add(num);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!hset.contains(i))
            {
                return i;
            }
        }
        Arrays.sort(nums);
        return nums[nums.length-1]+1;
    }
}