class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0 , right = 0;
        int res = 0;
        Set<Character> vis = new HashSet<>();
       while (right < s.length()) {
            char ch = s.charAt(right);

            while (vis.contains(ch)) {
                vis.remove(s.charAt(left));
                left++;
            }

            vis.add(ch);
            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }
}
