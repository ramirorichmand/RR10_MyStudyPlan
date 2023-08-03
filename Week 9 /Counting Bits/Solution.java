class Solution {
    public int[] countBits(int n) {
        int [] ans=new int [n+1];
      
        for(int i=0;i<=n;i++){
           
          ans[i]=Bits(i);
            
        }
        return ans;
    }
    public int Bits(int n){
        int c=0;
        while(n!=0){
            c+=(n&1);
            n=n>>1;
        }
        return c;
    }
}