class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length());
            sb.append("~");
            sb.append(s);
        }
        
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        char[] ca = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ca.length; i++) {
            char c = ca[i];
            System.out.println(c);
            while (Character.isDigit(c)) {
                
                sb.append(c);
                i++;
                c = ca[i];
            }
            i++;
            int number = Integer.parseInt(sb.toString());
            sb.setLength(0);
            for (int j = 0; j < number; j++) {
                sb.append(ca[i]);
                i++;
            }
            i--;
            strs.add(sb.toString());
            sb.setLength(0);
        }
        return strs;
    }
}
