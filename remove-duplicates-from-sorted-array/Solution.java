class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                nums[k]=nums[i];
                k+=1;
                set.add(nums[i]);
            }
        }
        return k;
    }
}