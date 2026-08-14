import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        
        if ( nums.length == 0  )
        {
            return 0  ; 

        }

        if ( nums.length == 1 )
        {
            return nums[0]  ; 

        }
        int chck = 0 ;

        for (int x : nums )
        {
            if ( x < 0 ){ chck = 1 ; continue ; }
            else { chck = 0 ; break ; }
        }
        if ( chck == 1 )
        {
            Arrays.sort(nums);
            int val = nums[nums.length-1];

            return val  ;
        }
        int cs = 0 ;
        int ms = 0 ;
        for (int i = 0 ; i < nums.length ;  i++ )
        {

            if ( cs + nums[i] < 0 )
            {
                cs = 0 ; 
                continue ; 
            }
            else 
            {
                cs = cs + nums[i];
                if ( cs > ms )
                {
                    ms = cs ; 

                }
            }
        }
        return ms ;
        
    }
}