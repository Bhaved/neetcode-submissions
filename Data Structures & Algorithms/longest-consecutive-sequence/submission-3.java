class Solution {
    public int longestConsecutive(int[] nums) {
//Input: nums = [2,20,4,10,3,4,5]
//nums=[0,3,2,5,4,6,1]
        Set<Integer> set = new HashSet<>();
        if(nums.length == 0){
            return 0;
        }
        for(int num : nums){
            set.add(num);
        }

       
        boolean seq = true;
        int i =0;
        int max =1;
        for(int num : nums){
            int start = num;
             int result = 0;
            while(set.contains(start)){
                start = start+1;
                result++;
            }
            if(result> max){
                max = result;
                result = 0;
            }
        }
        return max;
    }
}
