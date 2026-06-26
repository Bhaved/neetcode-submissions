class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        if(digits[0] == 0){
            digits[0] = digits[0]+1;
            return digits;
        }
        if(digits[digits.length-1] != 9){
            digits[digits.length-1] =  digits[digits.length-1] + 1;
            return digits;
        }
//digits=[9,8,9]
         for(int i = digits.length-1; i>=0; i--){
             if(digits[i] == 9){
                digits[i] =  0; 
                carry = 1;    
             }else{
                digits[i] =  digits[i] + 1;
                carry = 0;
                return digits; 
             }   
         }
        
         if( carry == 1 && digits[0] ==0){
                //digits[i] = 0;
                int[] res = new int[digits.length+1];
                res[0] = 1;
                for(int j =1; j < res.length; j++){
                    res[j] = digits[j-1];
                }
                return res;
             } 
        return digits;
    }

    
}


  //1999