class Trie {
	class TrieNode {
		char data; /* optional */
		private boolean endOfWord;
		private TrieNode[] childrens;

		public TrieNode(char data) {
			this.data = data;
			endOfWord = false;
			childrens = new TrieNode[26];
		}

		public TrieNode() {
			childrens = new TrieNode[26];
		}
	}

	private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
    root = new TrieNode();
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		if (word == null || word.isEmpty())
			return;
		TrieNode curr = root;
		for (char c : word.toCharArray()) {
			int index = c - 'a';
			if (curr.childrens[index] == null) {
				curr.childrens[index] = new TrieNode(c);
			}
			// move to next pointer
			curr = curr.childrens[index];
		}
		curr.endOfWord = true;
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		if (word == null || word.isEmpty())
			return false;
		TrieNode curr = root;
		for (char c : word.toCharArray()) {
			int index = c - 'a';
			if (curr.childrens[index] == null) {
				return false;
			}
			curr = curr.childrens[index];
		}
		return curr.endOfWord;
	}

	/** Returns if there is any word in the trie that starts with the given prefix. */
	public boolean startsWith(String prefix) {
		if (prefix == null || prefix.isEmpty())
			return false;
		TrieNode curr = root;
		for (char c : prefix.toCharArray()) {
			int index = c - 'a';
			if (curr.childrens[index] == null) {
				return false;
			}
			curr = curr.childrens[index];
		}
		return curr != null;

	}
}