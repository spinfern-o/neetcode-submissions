class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mostSeen = new HashMap<>();
        int[] frequents = new int[k];
        for (int n: nums){
            mostSeen.merge(n, 1, Integer::sum);
        }
        for(int i = 0; i < k; i++){
            int bestKey = 0, bestCount = -1;
            for (Map.Entry<Integer, Integer> e: mostSeen.entrySet()){
                if (e.getValue() > bestCount){
                    bestKey = e.getKey();
                    bestCount = e.getValue();
                }
            }
            frequents[i] = bestKey;
            mostSeen.remove(bestKey);
        }
        return frequents;
    }
}
