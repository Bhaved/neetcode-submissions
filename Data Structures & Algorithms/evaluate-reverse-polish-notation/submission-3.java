class Solution {
    public int evalRPN(String[] tokens) {

        
         int result =0;
         int first =0;
         int second = 0;

        Stack<Integer> stack = new Stack<>();
      
     for(String token : tokens){
       
       if(token.equals("+")){
          first =stack.pop();
          second = stack.pop(); 
         result = first+second;
         stack.push(result);
       } else if(token.equals("-")){
         first =stack.pop();
          second = stack.pop(); 
         result = second - first;
         stack.push(result);
       }
        else if(token.equals("*")){
          first =stack.pop();
          second = stack.pop(); 
         result = second * first;
         stack.push(result);

       }
        else if(token.equals("/")){

           first =stack.pop();
          second = stack.pop(); 
         result = second / first;
         stack.push(result);

       }else{
          stack.push(Integer.parseInt(token));

       }
    
    
    

     }

     return stack.pop();
        
    }
}
