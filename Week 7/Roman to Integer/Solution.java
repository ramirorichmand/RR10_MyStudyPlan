class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>H=new HashMap<>();
        H.put('I',1);
        H.put('V',5);
        H.put('X',10);
        H.put('L',50);
        H.put('C',100);
        H.put('D',500);
        H.put('M',1000);
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && H.get(s.charAt(i))<H.get(s.charAt(i+1))){
                ans-=H.get(s.charAt(i));
            }
            else{
                ans+=H.get(s.charAt(i));
            }
        }
        return ans;
    }
}