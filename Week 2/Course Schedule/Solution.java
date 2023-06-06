class Solution {
    boolean flag = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Set<Integer> s = new HashSet<>();
        Map<Integer, List<Integer>> hs = new HashMap<>();
        for (int[] pre : prerequisites) {
            int c = pre[0];
            int prereqCourse = pre[1];
            hs.putIfAbsent(c, new ArrayList<>());
            hs.get(c).add(prereqCourse);
        }
        System.out.println(hs);
        for (int i = 0; i < numCourses; i++) {
            if (!s.contains(i)) {
                dfs(s, i, hs, new HashSet<>());
            }
        }
        
        return flag;  
    }
    
    public void dfs(Set<Integer> s, int curr, Map<Integer, List<Integer>> hs, Set<Integer> s2) {
        if (s2.contains(curr)) {
            flag = false; 
            return;
        }
        if (!hs.containsKey(curr)) {
            return;
        }
        s2.add(curr);
        for (int prereqCourse : hs.get(curr)) {
            if (!s.contains(prereqCourse)) {
                dfs(s, prereqCourse, hs, s2);
            }
        }
        s2.remove(curr);
        s.add(curr);
    }
}