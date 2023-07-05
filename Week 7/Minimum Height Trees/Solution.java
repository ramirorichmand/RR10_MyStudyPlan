class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList();
        if (n < 2) {
            for (int i = 0; i < n; i++)
                result.add(i);
            
            return result;
        }
        
        int[] degree = new int[n];
        Map<Integer, List<Integer>> graph = new HashMap();
        for (int i = 0; i < n; i++)
            graph.put(i, new ArrayList());
        
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            degree[edge[0]]++;
            graph.get(edge[1]).add(edge[0]);
            degree[edge[1]]++;
        }
        
        Queue<Integer> queue = new ArrayDeque();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1)
                queue.add(i);
        }
        
        int size = 0;
        while (!queue.isEmpty()) {
            result = new ArrayList();
            size = queue.size();
            for (int i = 0; i < size; i++) {
                int node = queue.poll();
                result.add(node);
                degree[node]--;
                
                for (int neighbor : graph.get(node)) {                    
                    degree[neighbor]--;
                    
                    if (degree[neighbor] == 1)
                        queue.add(neighbor);
                }
            }
        }
        return result;
    }
}