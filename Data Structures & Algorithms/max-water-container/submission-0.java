class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0;
        int r = heights.length-1;

        int max =0;

        while(l<r){
 
         int cap = (Math.min(heights[r], heights[l])) * (r -l);
         if(cap> max){
            max = cap;
         }
         if(heights[l] < heights[r]){
            l++;
         }else{
            r--;
         }

        // System.out.println(cap);   

        }

        return max;

    }
}
