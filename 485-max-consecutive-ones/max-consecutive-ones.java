class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int x = 0 ; 
        int a = 0 ;
        for ( int i = 0 ; i<nums.length ; i ++ )
        {
            
            if ( nums[i] == 1 )
            {
                a = a+1 ; 
                if ( a >= x )
                {
                    x = a ;
                    
                }

            }
            
            else
            {
                a = 0 ;
            }
        }
        return x ; 
    }
}