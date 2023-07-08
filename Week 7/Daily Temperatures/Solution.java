class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> s = new Stack<>();
       int n = temperatures.length;
       int[] res = new int[n];
       for (int i = n - 1; i >= 0; i--){
           while (!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]){
               s.pop();
           }
           res[i] = s.isEmpty()? 0 : s.peek() - i;
           s.push(i);
       }
       return res;
    }
}