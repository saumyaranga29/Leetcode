class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int ans = 0;
        boolean odd = false;

        for (int i = 0; i < 128; i++) {
            ans += (freq[i] / 2) * 2;

            if (freq[i] % 2 == 1) {
                odd = true;
            }
        }

        if (odd) {
            ans++;
        }

        return ans;
    }
}