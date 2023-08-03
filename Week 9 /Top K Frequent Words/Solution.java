class Pair{
    String obj;
    int count;
    Pair(String x, int y){
        obj = x;
        count = y;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                if(a.count==b.count){
                    return a.obj.compareTo(b.obj);
                }
                return b.count - a.count;
            }
        });
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++){
            map.put(words[i], map.getOrDefault(words[i],0)+1);
        }
        for(Map.Entry<String, Integer> x: map.entrySet()){
            pq.add(new Pair(x.getKey(), x.getValue()));
        }
        ArrayList<String> ans = new ArrayList<>();
        while(!pq.isEmpty() && k>0){
            ans.add(pq.poll().obj);
            k--;
        }
        return ans;
    }
}