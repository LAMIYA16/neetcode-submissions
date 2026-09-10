class Solution {
    public boolean isPalindrome(String s) 
    {
        int i=0;
        int j=s.length()-1;
       
        char[] schar=s.toCharArray();
        while(i<j)
        {
            if(!Character.isLetterOrDigit(schar[i]))
            {
                i++;
            }

            else if(!Character.isLetterOrDigit(schar[j]))
            {
                j--;
            }

            else
            {
                if(Character.toLowerCase(schar[i]) != Character.toLowerCase(schar[j]))
                {
                    return false;
                }

                   j--;
                   i++;
            }
       

        }
        return true;
    }
}
