import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int removeDuplicates(int[] nums) {
        int x = nums.length;

        List <Integer> nx= Arrays.stream(nums).distinct().boxed().collect(Collectors.toCollection(ArrayList::new));
        int y = x-nx.size();
        int z = nx.size();
        for (int i = 1 ; i<=y ; i++)
        {
            nx.add(0);
        }

        for (int i = 0 ; i<x ; i++)
        {
            nums[i] = nx.get(i);
        }
        return z;
    }
}