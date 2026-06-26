class WordDictionary {


    Dict root;
    public WordDictionary() {
            root = new Dict();
    }

    public void addWord(String word) {
    
          Dict current = root;

          for(char ch : word.toCharArray()){
            
            int i = ch-'a';
            if(current.chaild[i] == null){
                current.chaild[i] = new Dict();
            }
            current = current.chaild[i];
          }
          current.endOfWord = true;

    }

        public boolean search(String word) {
                          Dict current = root;
                   return dfs(word, root);

        }

    public boolean dfs(String word, Dict root) {
          Dict current = root;
          int charIndex = 0;
          for(char ch : word.toCharArray()){
            if(ch == '.'){
                for(int i =0; i <26 ;i++){
                     char ch1 = (char) ('a' + i);
                     if(current.chaild[i] != null){
                      //String possibleWord = String.valueOf( (char) ('a' + i)) + word.substring(charIndex+1);
                      String possibleWord = word.substring(charIndex+1);

                      boolean isValid = dfs(possibleWord,current.chaild[i]);
                      if(isValid){
                        return true;
                      }
                     }
                }
                return false;
            }
            charIndex++;
            int i = ch-'a';
            if(current.chaild[i] == null){
                return false;
            }
            current = current.chaild[i];
          }
         return current.endOfWord;
    }
}

class Dict {

    Dict[] chaild = new Dict[26];
    boolean endOfWord = false;
}
