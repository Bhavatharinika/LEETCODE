class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        int len = s.length();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch=='{'||ch=='('||ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char popchar = stack.pop();
                    if(ch=='}' && popchar!='{'||ch==']' && popchar!='['||ch==')' && popchar!='('){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}