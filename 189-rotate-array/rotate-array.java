import java.util.*;
import java.util.stream.Collector;


class Solution {
    public void rotate(int[] nums, int k) {
        int x = 0 ; 
        if (nums.length < k )
        {
            x = k%nums.length ;
        }
        else
        {
            x = k ;
        }
        ArrayList <Integer> num = Arrays.stream(nums).boxed().collect(Collectors.toCollection(ArrayList::new));

        while (x > 0)
        {
           
            if(x!=0)
            {
                
                int temp = num.get(num.size()-1);
                num.remove(num.size()-1);
                num.add(0,temp);
                x--;
                
            }
        }
        for (int i = 0 ; i<num.size() ; i++)
        {
            nums[i]=num.get(i);
        }
    }
}