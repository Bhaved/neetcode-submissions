class Solution {
    public List<String> findWords(char[][] board, String[] words) {

          Trie  root = new Trie(); 
          for(String word : words){
                Trie current = root;
                for(char ch : word.toCharArray()){
                  
                  int index = ch-'a';
                  if(current.children[index] == null){
                    current.children[index] = new Trie();
                  }
                  current = current.children[index];

                }
                current.word = word;

          }
        List<String> results = new LinkedList<>();
         

         for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[0].length; j++) {
        dfs(i, j, root, board, results);
    }
}

         return results;
    
    }

    void dfs(int r, int c, Trie node, char[][] board, List<String> results){

        if(r<0 || c < 0 || r>=board.length || c>=board[0].length){
            return ;
        }
        if(board[r][c] == '#'){
            return;
        }
        char ch = board[r][c];
        int index = ch - 'a';
        if(node.children[index] == null){
            return;
        }
        node = node.children[index];
        if(node.word != null){
            results.add(node.word);
            node.word = null;
        }
        board[r][c] = '#';
        dfs(r, c+1, node, board,results);
         dfs(r, c-1, node, board,results);
         dfs(r+1, c, node, board,results);
         dfs(r-1, c, node, board,results);

    board[r][c] = ch;


    }


    
    
    class Trie{

        Trie[] children = new Trie[26];
        String word;
    }
}
