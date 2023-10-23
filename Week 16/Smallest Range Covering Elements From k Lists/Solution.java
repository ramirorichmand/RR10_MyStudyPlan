class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
    int[] res = {-(int)1e5,(int)1e5};
    int k = nums.size();
    int max = Integer.MIN_VALUE;
    PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[0]-b[0]));
    for(int i = 0; i<k; i++){
        int minOfList = nums.get(i).get(0);
        max = Math.max(max,minOfList);
        int[] toAdd = {minOfList,0,i};
        pq.add(toAdd);
        //0th idx we hav min value of list
        //1st idx we have the idx of the min value
        //2nd idx we have idx of the list
    }
    while(true){
        int[] rem = pq.poll();
        if(res[1]-res[0]>max-rem[0]){
            res[0] = rem[0];
            res[1] = max;
        }
        rem[1]++;  //element checked so idx increased to add next element from same list to pq
        List<Integer> currList = nums.get(rem[2]);
        if(rem[1]==currList.size()){
            break;  //break since no elements are left to be added to the list so cant do comparison between three
        }else{
            rem[0] = currList.get(rem[1]);
            max = Math.max(rem[0],max);  //if the new element coming in the pq could be greater than max so we checked for it
            pq.add(rem);
        }
    }
    return res;
    }
}

// ALTERNATIVELY //

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int[] res = {-100000 , 100000};
        PriorityQueue<int[]>pq = new PriorityQueue<>((a , b) -> a[0] - b[0]);
        int max = Integer.MIN_VALUE;
        int k = nums.size();

        for(int i = 0; i < k; i++){
            int minElem = nums.get(i).get(0);
            int[] arr = {minElem , 0 , i};

            max = Math.max(max , minElem);
            pq.add(arr);

        }
        while(true){
            int min[] = pq.poll();
            if(res[1] - res[0] > max - min[0]){
                res[1] = max;
                res[0] = min[0];
            }
            min[1]++;

            List<Integer>cur = nums.get(min[2]);

            if(min[1] == cur.size()){
                break;
            }
            else{
                min[0] = cur.get(min[1]);
                max = Math.max(max , cur.get(min[1]));
                pq.add(min);
            }
        }
        return res;
    }
}

