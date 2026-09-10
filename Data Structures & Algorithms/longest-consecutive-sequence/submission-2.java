class Solution {
    public int longestConsecutive(int[] nums)
    {
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
       
        
        int length=1;
        int longest=1;
        int j=1;;
        while(j<nums.length)
        {
            if(nums[j]==nums[j-1])
            {
                j++;
                continue;
            }
            else if(nums[j]-nums[j-1]==1)
            {
                length++;
            }

            else
            {
                 length=1;
            }
            
            longest=Math.max(longest,length);
            j++;
        }
       return longest;
    }
}
