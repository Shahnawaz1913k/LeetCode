
class Solution {
    public int[] findOriginalArray(int[] changed) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList();
        Arrays.sort(changed);
        
        for(int num : changed)
        {
            if(!queue.isEmpty() && num == queue.peek())
                queue.poll();
            else
            {
                queue.offer(num*2);
                ans.add(num);
            }
        }
        return !queue.isEmpty() ? new int[] {} : ans.stream().mapToInt(i -> i).toArray();
    }
}