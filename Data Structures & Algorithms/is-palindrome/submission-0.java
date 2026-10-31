class Solution {
    public boolean isPalindrome(String s) {
        // use two pointers, one pointed at start of string, i
        // the other pointed at end of string, j
        
        // while i < j;
        // check if s[i] is alpha numeric, if not 
        // advance i++
        // check if s[j] is alpha numberic if not
        // advance j--

        // check if s[i].lower() == s[j].lower()
        // if not, return false
        
        // if loop finishes, return true

        int i = 0;
        int j = s.length() - 1;

        char[] arr = s.toCharArray();
        System.out.println(j);
        while (i < j) {
            char a = arr[i];
            char b = arr[j];
            System.out.println(a + " " + b);
            if (!Character.isLetterOrDigit(a)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(b)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
