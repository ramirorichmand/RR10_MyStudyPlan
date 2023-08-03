class FreqStack {
   HashMap<Integer,Stack> st=new HashMap<>();
   HashMap<Integer,Integer> fmap=new HashMap<>();
   int maxfreq=0;
    public void push(int val) {
        int cfreq=fmap.getOrDefault(val,0);
        cfreq++;
        fmap.put(val,cfreq);
        if(st.containsKey(cfreq)==false)
        {
            st.put(cfreq,new Stack<>());
        }
        st.get(cfreq).add(val);
        maxfreq=Math.max(cfreq,maxfreq);

    }

    public int pop() {
        Stack<Integer> s= st.get(maxfreq);
        int ans=s.pop();
        int cfreq=fmap.get(ans);
        cfreq--;
        fmap.put(ans,cfreq);
        if(st.get(maxfreq).size()==0)
          maxfreq--;

        return ans;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */