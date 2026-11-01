class Solution {
    public boolean isValid(String s) {
        // add each chracter to a stack
        // for every chracter, if there is a close bracket, attempt
        // to pop, and match with the other open bracket
        // if not match, return false
        // at the end of string, check if size of stck is 0


        char[] c_arr = s.toCharArray();

        Stack<Character> stk = new Stack<Character>();

        for (Character c : c_arr) {
            if (c == ')') {
                if (!stk.isEmpty()) {
                    Character d = stk.pop();

                    if (d != '(') {
                        return false;
                    }

                    continue;
                }
            }

            if (c == '}') {
                if (!stk.isEmpty()) {
                    Character d = stk.pop();

                    if (d != '{') {
                        return false;
                    }

                    continue;
                }
            }

            if (c == ']') {
                if (!stk.isEmpty()) {
                    Character d = stk.pop();

                    if (d != '[') {
                        return false;
                    }

                    continue;
                }
            }

            stk.add(c);
        }

        if (stk.isEmpty()) return true;

        return false;
    }
}
