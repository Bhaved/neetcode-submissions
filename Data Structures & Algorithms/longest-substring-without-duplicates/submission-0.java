class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int max = 0;
        while(i<s.length()){
           if(!set.contains(s.charAt(i))){
              set.add(s.charAt(i));
              if(max<set.size()){
                max = set.size();
              }
              i++;
           }else{
              i = i - set.size()+1;
              set.clear();
           }

        }
        return max;
    }
}
