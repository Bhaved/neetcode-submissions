class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        Arrays.sort(nums);
       Set<String> set = new HashSet<>();
       List<List<Integer>> result = new ArrayList<>();
       for(int i =0; i<nums.length -2; i++){
        int l = i+1;
        int r = nums.length -1;
        while(l < r){
                 
                if(nums[i] + nums[l]+nums[r] == 0){
                   
                  String  key = "key"+nums[i]+nums[l]+nums[r];
                  if(!set.contains(key)){
                    List<Integer> list = List.of(nums[i], nums[l], nums[r]);
                    result.add(list);
                    set.add(key);
                  }
                  l++;
                }else if(nums[i]+nums[l]+nums[r] > 0){
                        r--;
                }else{
                    l++;
                }
        }
       }
        return result;
    }
}
