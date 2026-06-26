class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()){
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
         Arrays.sort(chars);
         Arrays.sort(chars1);

       

        if(new String(chars).equals(new String(chars1))){
            return true;
        }
        return false;

    }
}
