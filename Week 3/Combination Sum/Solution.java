class Solution {
    static void solve(int[] arr, int i, List<Integer> lst, int target, List<List<Integer>> ans){

        if(i==arr.length){      //if target sum is equal to current subsequnce sum
            if(target==0) ans.add(new ArrayList<>(lst));
            return;
        }
        if(arr[i]<=target){     //pick condition
            lst.add(arr[i]);
            solve(arr, i, lst, target-arr[i],ans);
            lst.remove(lst.size()-1);
        }
        // not pick condition
        solve(arr, i+1, lst, target,ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> arr=new ArrayList<>(); 
        List<List<Integer>> ans=new ArrayList<>();
        solve(candidates, 0, arr,  target, ans);
        return ans;
    }
}