class PrefixTree {

    
    TrieNode root;

    public PrefixTree() {
                 root = new TrieNode();

    }



    public void insert(String word) {

        TrieNode current = root;

        for(char ch : word.toCharArray()){
            int index = ch -'a';
            if(current.chaild[index] == null){
                current.chaild[index] = new TrieNode();
            }
            current = current.chaild[index];
        }

        current.hasWord = true;

    }

    public boolean search(String word) {
          TrieNode current = root;

        for(char ch : word.toCharArray()){
            int index = ch -'a';
            if(current.chaild[index] == null){
               return false;
            }
           current = current.chaild[index];
        }

         return current.hasWord;              
    }

    public boolean startsWith(String prefix) {

        TrieNode cur = root;
        for (char c : prefix.toCharArray()) {
            int i = c - 'a';
            if (cur.chaild[i] == null) {
                return false;
            }
            cur = cur.chaild[i];
        }
        return true;
    

    }
}
class TrieNode {

    TrieNode[] chaild = new TrieNode[26];
    boolean hasWord = false;
}
