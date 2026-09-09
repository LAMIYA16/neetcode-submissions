class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] list=new int[nums.length];  
        int p=1;
        int pref=1;
        int suff=1;
       
        int i=0;
        while(i<nums.length)
        {
           list[i]=pref;
           pref=pref*nums[i];
           i++;

        }

        int j=nums.length-1;
        while(j>=0)
        {
            
            list[j] = list[j] * suff;
            suff = suff * nums[j];
            j--;
        }
          
        return list;
    }
}  
