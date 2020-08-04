/**
 * @author : Anmol Agrawal
 */
class Trie {
    
    boolean isEndOfWord;
    Trie children[] = new Trie[26];
    
    /** Initialize your data structure here. */
    public Trie() {
        isEndOfWord = false;
        Arrays.fill(children, null);
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie current  = this;
        int length = word.length();
        for(int i = 0; i < length; i++){
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                current.children[index] = new Trie();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie current  = this;
        int length = word.length();
        for(int i = 0; i < length; i++){
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie current  = this;
        int length = prefix.length();
        for(int i = 0; i < length; i++){
            int index = prefix.charAt(i) - 'a';
            if(current.children[index] == null){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */