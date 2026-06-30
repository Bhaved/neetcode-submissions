class Solution {
    public int numIslands(char[][] grid) {

        boolean[][] flags = new boolean[grid.length][grid[0].length];
        for(int i =0; i<grid.length;i++){
            for(int j =0; j< grid[i].length; j++){
                flags[i][j] = false;
            }
        }
         int counter =0;
         for(int i =0; i<grid.length;i++){
            for(int j =0; j< grid[i].length; j++){
                System.out.println("flags "+ flags[i][j]);
                if(flags[i][j] == false && grid[i][j] == '1'){
                        counter++;
                        dfs(i,j,flags,grid);
                        
                }
            }
            
        }
        return counter;
    }
    void dfs(int row, int col, boolean[][] flags, char[][] board){

        if(row<0 || col <0 || row>=board.length || col >= board[row].length){
            return;
        }
        if(board[row][col] == '0' || flags[row][col] == true){
            return;
        }
        flags[row][col] = true;
        dfs(row+1,col, flags, board);
        dfs(row,col+1, flags, board);
        dfs(row-1,col, flags, board);
        dfs(row,col-1, flags, board);
        
        
       
       
    }
}
