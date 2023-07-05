class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) {  // p annot be longer than s
            return ans;
        }
        // create hashmaps to store the frequencies of characters
        // we would check every window of size len(p)
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> pMap = new HashMap<>();
        // store the frequency for the starting window
        for (int i = 0; i < p.length(); i++) {
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        // if frequencies are same means we got an anagram
        if (sMap.equals(pMap)) {    
            ans.add(0);     // add the first index
        }
        
        // window size of len(p)
        int l = 0, r = p.length();
        // Now we will start sliding the window
        while (r < s.length()) {
            // Acquire the next char at right
            char acquire = s.charAt(r++);   // r moves ahead
            // put it on the map/update its frequency
            sMap.put(acquire, sMap.getOrDefault(acquire, 0) + 1);

            // get rid the first char from extreme left of window
            char discard = s.charAt(l++);   // l moves ahead
            sMap.put(discard, sMap.get(discard) - 1);
            // if frequency has become 0, remove the mapping itself
            if (sMap.get(discard) == 0) {   
                sMap.remove(discard);
            }

            // our window has already moved forward when we did r++ and l++
            // if frequencies are same we have found an anagram
            if (sMap.equals(pMap)) {
                ans.add(l);  // add the left bound of the window
            }
        }

        return ans;
    }
}