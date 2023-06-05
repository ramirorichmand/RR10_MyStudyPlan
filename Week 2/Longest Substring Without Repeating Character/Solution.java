class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, l = 0, r = 0;
        int n = s.length();
        int[] map = new int[256];
        Arrays.fill(map, -1);
        while (r < n) {
            if (map[s.charAt(r)] != -1) {
                l = Math.max(map[s.charAt(r)] + 1, l);
            }
            map[s.charAt(r)] = r;
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}