class Solution {
    public int[] productExceptSelf(int[] nums) {
      
      int[] prefix = new int[nums.length];
      int[] suffix = new int[nums.length];
       int result = 1;

      //Input: nums = [1,2,4,6]

      for(int i =0; i<nums.length;i++){    
          prefix[i] = result;
         result = result* nums[i];
      }
       result = 1;
      for(int i =nums.length-1; i>=0;i--){    
         suffix[i] = result;
         result = result* nums[i];
      }
      
       for(int i =0; i<nums.length;i++){    
          prefix[i] = prefix[i]*suffix[i];
         
      }
      return prefix;
    }
}  
