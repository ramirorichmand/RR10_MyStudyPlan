class Solution {
    Set<String> result = null;
    char [] [] board  = null;
    Trie trie = null;
    public List<String> findWords(char[][] board, String[] words) {
        this.board = board;
        result = new HashSet<>();
        // Build Trie on words
        trie = new Trie();
        for(String word: words) trie.add(word);
        //////////
        
        // Start recursion calls on each character in the board which  contains entry in the root of the trie.
        for(int i=0;i<this.board.length;i++) {
            for(int j=0; j<this.board[i].length; j++) {
                if(trie.root.array[this.board[i][j] - 'a'] != null) {
                    findWords(i, j, trie.root.array[this.board[i][j] - 'a'], new HashSet<String>());
                }
            }
        }
        return new ArrayList<>(result);
    }


    void findWords(int i, int j, TrieNode curr, Set<String> visited) {
        if(curr.value != null) {
            result.add(curr.value);
        }
        visited.add(i+"#"+j);
        TrieNode temp = null;
        /*
            * Conditional statements prunes invalid branches.
        */
        if(i>0 && (temp=curr.array[board[i-1][j] -'a']) != null && !visited.contains((i-1)+"#"+j)) {
            findWords(i-1, j, temp, visited);
        }

        if(j>0 && (temp=curr.array[board[i][j-1] -'a']) != null && !visited.contains(i+"#"+(j-1))) {
            findWords(i, j-1, temp, visited);
        }

        if(i<board.length-1 && (temp=curr.array[board[i+1][j] -'a']) != null && !visited.contains(""+(i+1)+"#"+j)) {
            findWords(i+1, j, temp, visited);
        }

        if(j<board[i].length-1 && (temp=curr.array[board[i][j+1] -'a']) != null && !visited.contains(i+"#"+(j+1))) {
            findWords(i, j+1, temp, visited);
        }
        visited.remove(i+"#"+j);

    }
}

class TrieNode {
    TrieNode [] array;
    String value;
    TrieNode() {
        array = new TrieNode[26];
    }
}

class Trie{
    TrieNode root;
    Trie() {
        root = new TrieNode();
    }

    void add(String word) {
        TrieNode temp=root;
        for(int i=0;i<word.length();i++) {
            char ch=word.charAt(i);
            if(temp.array[ch-'a'] == null) {
                temp.array[ch-'a']= new TrieNode();
                temp = temp.array[ch-'a'];
            } else {
                temp=temp.array[ch-'a'];
            }
        }
        temp.value=word;
    }
}