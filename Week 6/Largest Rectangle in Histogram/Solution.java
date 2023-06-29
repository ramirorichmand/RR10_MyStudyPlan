class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans=0;
        int ps[]=previousSmall(heights);
        int ns[]=nextSmall(heights);
        for(int i=0 ;i<heights.length ;i++){
            ans=Math.max(ans,(ns[i]-ps[i]-1)*heights[i]);
        }
        return ans;
    }
    public int[] previousSmall(int[] arr) {
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
        int[] ans=new int[n];
        for(int i=0 ;i<n ;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) s.pop();
            if(s.isEmpty()) ans[i]=-1;
            else ans[i]=s.peek();
            
            s.push(i);
        }
        return ans;
        
    }
    public int[] nextSmall(int[] arr) {
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
        int[] ans=new int[n];
        for(int i=n-1 ;i>=0 ;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) s.pop();
            if(s.isEmpty()) ans[i]=n;
            else ans[i]=s.peek();
            
            s.push(i);
        }
        return ans;
        
    }
}