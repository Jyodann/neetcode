class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        List<Integer>[] freq_list = new ArrayList[nums.length + 1];
        for (Integer i : nums) {
            if (counts.containsKey(i)) {
                counts.put(i, counts.get(i) + 1);
            } else {
                counts.put(i, 1);
            }
        } 

        for (int i = 0; i < freq_list.length; i++) {
            freq_list[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            freq_list[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];

        int next = 0;

        for (int i = freq_list.length - 1; i > 0; i--) 
        {
            List<Integer> s = freq_list[i];

            if (s.size() != 0) {
                for (Integer j : s) 
                {
                    if (next == k) {
                        break;
                    }
                    result[next] = j;
                    next++;
                }
            }

            if (next == k) break;
        }

        return result;
    }
}
