class Solution {
    public boolean isAnagram(String s, String t) {
        // sort both strings n (log n)
        
        if (s.length() != t.length()) {
            return false;
        }
        char[] a = s.toCharArray();
        Arrays.sort(a);

        char[] b = t.toCharArray();
        Arrays.sort(b);

        for (int i = 0; i < s.length(); i++) {
            char s_0 = a[i];
            char s_1 = b[i];

            if (s_0 != s_1) {
                return false;
            }
        }
        
        return true;
    }
}
