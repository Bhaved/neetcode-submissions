class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] != 0){
            return 0;
        }
        
        for(int i =1;i< nums.length; i++){
             
             int bit = nums[i] ^ i;
             if(bit != 0){
                return i;
             }
        }
        return nums[nums.length-1] +1;
    }
}

