class Solution {
    public int reverse(int x) {
        StringBuilder s = new StringBuilder();
        s.append(Math.abs(x));
        s.reverse();
        if (s.length() >= 10 ){
            int c1 = Integer.parseInt(s.substring(0 , 5) );
            int c2 = Integer.parseInt(s.substring(5 , 10) );
            if (c1 > 21474 || c2 > 83647){
                return 0;
            }
        }

       int num = Integer.parseInt(s.toString());
        
        return (x < 0) ? -num : num ;
    }
}