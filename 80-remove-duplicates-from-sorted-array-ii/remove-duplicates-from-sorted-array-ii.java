class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1 ){return 1 ; }
        if (nums.length == 2 ){return 2 ; }
        int track = 2 ;
        
        for ( int i = 2 ; i <nums.length ; i++ )
        {
            if (nums [i] != nums[track-2])
            {
                nums[track] = nums[i];
                track ++;
            }
        }
        return track ;
    }
}