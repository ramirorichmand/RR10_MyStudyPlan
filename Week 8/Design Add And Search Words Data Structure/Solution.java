class WordDictionary {

    class TrieNode{
        boolean isEndOfWord;
        TrieNode [] children ;

        public TrieNode(){
            isEndOfWord = false;
            children = new TrieNode[26];

            for ( int i = 0; i < 26; i++){
                children[i] = null;
            }
        }
    }

    TrieNode root;

    public WordDictionary() {
        this.root = new TrieNode();

    }

    public void addWord(String word) {
        TrieNode itr = this.root;
        int index = -1;
        for (char ch : word.toCharArray()){
            index = ch - 'a';

            if (itr.children[index] == null){
                itr.children[index] = new TrieNode();
            }

            itr = itr.children[index];
        }
        itr.isEndOfWord = true;
    }

    public boolean search(String word) {
        return searchHelper(this.root, word, 0);
    }

    private boolean searchHelper(TrieNode node, String word, int index) {

        if (index == word.length()){
            return node.isEndOfWord;
        }

        char ch = word.charAt(index);
        if (ch == '.'){
            for (int i = 0; i < 26; i++){
                if (node.children[i] != null && (searchHelper(node.children[i], word, index+1))){
                    return true;
                }
            }
            return false;
        }else{

            if (node.children[ch-'a'] != null){
                return searchHelper(node.children[ch-'a'], word, index+1);
            }else{
                return false;
            }
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */