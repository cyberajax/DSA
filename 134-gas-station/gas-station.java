class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < gas.length; i++) {
            a += gas[i] - cost[i];
            b += gas[i] - cost[i];

            if (b < 0) {
                c = i + 1;
                b = 0;
            }
        }

        return a < 0 ? -1 : c;
    }
}