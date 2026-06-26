class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
      
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        dfs(nums, target, 0, subset, res);

        return res;
    
    }

    public void dfs(int[] nums, int target, int i, List<Integer> subset , List<List<Integer>> res){
       List<Integer> set = new ArrayList<>(subset);
        int sum = set.stream().mapToInt(Integer:: intValue).sum();
        if(sum  ==  target){
            res.add(set);             
             return ;
         }
         if(i >= nums.length || sum > target){
            return;
         }
             subset.add(nums[i]);
             dfs(nums, target, i, subset, res);
             subset.remove(subset.size()-1);
             dfs(nums, target, i+1, subset, res);
        }
    }

