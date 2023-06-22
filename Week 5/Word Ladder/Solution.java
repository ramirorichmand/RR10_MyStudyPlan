class Pair<U,V>{
    //first is the current word
    //second is the priority for the priority queue
    U first;
    V second;
    
    Pair(U _first, V _second){
        first = _first;
        second = _second;
    }
}

class Solution {
  public int ladderLength(String beginWord, String endWord, List<String> wordList) {

    // Since all words are of same length.
    int L = beginWord.length();

    // Dictionary to hold combination of words that can be formed,
    // from any given word. By changing one letter at a time.
    Map<String, List<String>> allComboDict = new HashMap<>();

    for(String word : wordList){
        for (int i = 0; i < L; i++) {
            // Key is the generic word
            // Value is a list of words which have the same intermediate generic word.
            String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
            List<String> transformations = allComboDict.getOrDefault(newWord, new ArrayList<>());
            transformations.add(word);
            allComboDict.put(newWord, transformations);
         }
    }

    // Queue for A*
    PriorityQueue<Pair<String, Integer>> PQ = new PriorityQueue<>((a,b)-> a.second - b.second);
    PQ.add(new Pair(beginWord, 0));

    // Visited is used to keep track of the cost of the nodes that we have already visited and the cost it takes to 
	// reach the node. 
    Map<String, Integer> visited = new HashMap<>();
    //we start with a default cost of 1
	visited.put(beginWord, 1);

    while (!PQ.isEmpty()) {
      Pair<String, Integer> node = PQ.poll();
      String word = node.first;

      for(int i = 0; i < L; i++) {

        // Intermediate words for current word
        String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);

        // Next states are all the words which share the same intermediate state.
        for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<>())) {
          
          //the cost to the adjacent word is 1 plus the cost to reach the word  
          int new_cost =  visited.get(word) + 1;
          
            // If at any point if we find what we are looking for
          // i.e. the end word - we can return with the answer.    
          if (adjacentWord.equals(endWord)) {
            return new_cost;
          }
        
          if (!visited.containsKey(adjacentWord) || (new_cost < visited.get(adjacentWord))){
            visited.put(adjacentWord, new_cost);
            int heuristic_value = h(adjacentWord, endWord);
            int priority = new_cost + heuristic_value;
            PQ.offer(new Pair(adjacentWord, priority));
          }
        }
      }
    }

    return 0;
  }

    
    //The heuristic function - The distance from the current word to the end word is atleast as many steps to change the unequal characters in both the strings
    private int h(String word, String word1){
        int diff = 0;
        
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=word1.charAt(i))
                diff++;    
        }
        
        return diff;
    }
}