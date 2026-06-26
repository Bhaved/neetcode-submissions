class Solution {
    public int reverseBits(int n) {
        
         int res = 0;
//.   01011
//.   1
         for(int i =0; i < 32; i++){

            int bit = (n >> i) & 1;
            res += (bit << (31-i));

         }  
         return res; 
    }
}