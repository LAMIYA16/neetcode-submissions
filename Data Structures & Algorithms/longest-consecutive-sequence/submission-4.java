class Solution {
    public int longestConsecutive(int[] nums)
    {
        Set<Integer> snums=new HashSet<>();
        for(int n:nums)
        {
            snums.add(n);
        }

        int longest=0;
        for(int n:snums)
        {
            if(!snums.contains(n-1))
           { 
            int length=1;
            

            while(snums.contains(n+length))
            {
                length++;
            }
            longest=Math.max(longest,length);
           }
        }

        return longest;
    }
}
