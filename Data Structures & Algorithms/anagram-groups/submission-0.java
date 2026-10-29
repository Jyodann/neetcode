class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a hashmap of <String, List<String>>
        // sort every string, and index into the HashMap
        // with the sorted string, add it to the String
        // List

        HashMap<String, List<String>> hm = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            
            if (hm.containsKey(sorted)) {
                hm.get(sorted).add(s);
            } else {
                List<String> arr_list = new ArrayList<>();
                arr_list.add(s);
                hm.put(sorted, arr_list);
            }
        } 

        List<List<String>> ans = new ArrayList<>();

        for (List<String> i : hm.values())     
        {
            ans.add(i);
        }

        return ans;
    }
}
