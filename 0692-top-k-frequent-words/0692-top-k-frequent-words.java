class Solution {
    public List<String> topKFrequent(String[] words, int k) {
      Map<String, Integer> count = new HashMap<String, Integer>();
        List<String> result = new LinkedList<String>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        Queue<String> pq = new PriorityQueue<String>((w1, w2) -> count.get(w1).equals(count.get(w2)) ? w1.compareTo(w2) : count.get(w2) - count.get(w1));
        for (String word : count.keySet()) {
            pq.offer(word);
        }
        for (int i = 0; i < k; i++) {
            result.add(pq.poll());
        }
        return result;  
    }
}