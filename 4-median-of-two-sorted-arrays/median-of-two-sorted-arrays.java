class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int a = 0, b = 0, c = 0;
        int[] d = new int[m + n];

        while (a < m && b < n) {
            if (nums1[a] < nums2[b])
                d[c++] = nums1[a++];
            else
                d[c++] = nums2[b++];
        }

        while (a < m)
            d[c++] = nums1[a++];

        while (b < n)
            d[c++] = nums2[b++];

        int e = m + n;

        if (e % 2 == 1)
            return d[e / 2];

        return ((double) d[e / 2 - 1] + d[e / 2]) / 2;
    }
}