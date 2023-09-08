import java.util.*;

class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source == target) return 0;
        boolean foundS = false, foundT = false;
        for (int[] route : routes) {
            for (int i : route) {
                if(!foundS && i == source) foundS = true;
                if(!foundT && i == target) foundT = true;
            }
        }
        if (foundS == false || foundT == false) return -1;
        boolean[] visit = new boolean[routes.length];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < routes.length; i++){
            for(int x : routes[i]){
                List<Integer> list = map.getOrDefault(x, new ArrayList<>());
                list.add(i);
                map.put(x, list);
            }
        }
        int step = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            step++;
            int size = q.size();
            while(size-- > 0){
                int cur = q.poll();
                if(!map.containsKey(cur)) continue;
                for(int x : map.get(cur)){
                    if(visit[x]) continue;
                    visit[x] = true;
                    for(int y : routes[x]){
                        if(y == target) return step;
                        q.add(y);
                    }
                }
            }
        }
        return -1;
    }
}