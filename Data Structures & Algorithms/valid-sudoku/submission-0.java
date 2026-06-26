class Solution {
    public  boolean isValidSudoku(char[][] board) {
        Set<Character> outerSet = new HashSet<>();
        Set<Character> innerSet = new HashSet<>();
        Map<String, Set<Character>> integerSetMap = new HashMap<>();

        for(int i =0; i<board.length;i++){
            for(int j =0; j<board.length;j++){
                if(board[i][j] != '.' && outerSet.contains(board[i][j])){
                    return false;
                }else{
                    outerSet.add(board[i][j]);
                }
                if(board[j][i] != '.' && innerSet.contains(board[j][i])){
                    return false;
                }else{
                    innerSet.add(board[j][i]);
                }
                int subI = i/3;
                int subJ = j/3;
                String key = subI + "_" + subJ;

                if(board[i][j] != '.') {
                    if (integerSetMap.containsKey(key)) {
                        if (integerSetMap.get(key).contains(board[i][j])) {
                            return false;
                        } else {
                            integerSetMap.get(key).add(board[i][j]);
                        }
                    } else {
                         Set<Character> set = new HashSet<>();
                        set.add(board[i][j]);
                        integerSetMap.put(key, set);
                    }
                }
            
            }
            outerSet.clear();
            innerSet.clear();
        }

        return true;
    }
}
