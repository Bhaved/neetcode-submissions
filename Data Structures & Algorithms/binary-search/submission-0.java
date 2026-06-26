class Solution {
    public int search(int[] nums, int target) {

            return searchR(nums, target, 0, nums.length-1);
       
    }

    int searchR(int[] nums, int target, int begin, int end){
        
               System.out.println("Start "+ begin + " end "+ end);
        if(begin > end){
            return -1;
       }
       int mid = begin+ (end -begin)/2 ;
       if(target == nums[mid]){
        return mid;
       }
      
       else if(target > nums[mid] ) {
            return searchR(nums, target, mid+1, end);
       } 
       else{
        return searchR(nums, target, 0, mid-1);
       }  

    }
}
