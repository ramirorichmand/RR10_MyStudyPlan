/* The isBadVersion API is already defined.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int f = 1, l = n;
            while(f<=l){
                int m = f+(l-f)/2;
                if(!isBadVersion(m)){
                    f = m+1;
                }else{
                    l = m-1;
                }
            }
            return f;
        }
    }