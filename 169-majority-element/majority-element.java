class Solution {
    public int majorityElement(int[] nums) {
        int num = 0 ; 
        int count = 0 ; 
        for ( int x:nums)
        {
            if(count==0){num=x;count=1;}
            else if (x==num){count=count+1;}
            else
            {   
                count--;
                if(count==0){num=x;}
            }
            
        
        }
        return num;
    }
}
