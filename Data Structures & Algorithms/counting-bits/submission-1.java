class Solution {
    public int[] countBits(int n) {
        
         int[] res = new int[n+1];
         res[0] = 0;
         //res[1] = 1;
        for(int i =1; i <= n;i++){
           int temp = i;
           int bits =0;
           while(temp>0 ){
            temp = temp & (temp-1);
            bits+= 1;
           }
           res[i] = bits;

        }
        return res;
    }
}
