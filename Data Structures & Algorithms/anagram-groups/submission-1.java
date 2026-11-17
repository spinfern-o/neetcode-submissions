class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);

            if (!groups.containsKey(key)){
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(strs[i]);
        }

        return new ArrayList<>(groups.values());
    }
}
