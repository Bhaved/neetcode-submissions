class Solution {
    public int[] twoSum(int[] nums, int target) {
        
            Map<Integer,Integer> map = new HashMap<>();
            for(int i =0; i< nums.length; i++){
                if(map.containsKey(target - nums[i])){
                    int index = map.get(target - nums[i]);
                    int[] arr = new int[2];
                    arr[0] = index;
                    arr[1] = i;
                    return arr;
                }else{
                    map.put(nums[i], i);
                }
            }
            return new int[0];
    }
}
