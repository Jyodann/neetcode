class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < tokens.length; i++) { 
            String token = tokens[i];

            switch (token) {
                case "+":
                    s.push(s.pop() + s.pop());
                    break;
                case "-":
                    int first_minus = s.pop();
                    int second_minus = s.pop();
                    s.push(second_minus - first_minus);
                    break;

                case "*":
                    s.push(s.pop() * s.pop());   
                    break;
                case "/":
                    int first_div = s.pop();
                    int second_div = s.pop();
                    s.push(second_div / first_div);
                    break;
                default:
                    s.push(Integer.parseInt(token));
                    break;
            }
        }

        return s.pop();
    }
}
