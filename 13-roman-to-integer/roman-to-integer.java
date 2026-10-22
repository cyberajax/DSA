class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int a = 0;

        for (int b = 0; b < n; b++) {
            int c = 0, d = 0;

            switch (s.charAt(b)) {
                case 'I': c = 1; break;
                case 'V': c = 5; break;
                case 'X': c = 10; break;
                case 'L': c = 50; break;
                case 'C': c = 100; break;
                case 'D': c = 500; break;
                case 'M': c = 1000; break;
            }

            if (b + 1 < n) {
                switch (s.charAt(b + 1)) {
                    case 'I': d = 1; break;
                    case 'V': d = 5; break;
                    case 'X': d = 10; break;
                    case 'L': d = 50; break;
                    case 'C': d = 100; break;
                    case 'D': d = 500; break;
                    case 'M': d = 1000; break;
                }
            }

            if (c < d)
                a -= c;
            else
                a += c;
        }

        return a;
    }
}