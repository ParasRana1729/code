/*
 * @lc app=leetcode id=1021 lang=java
 *
 * [1021] Remove Outermost Parentheses
 */

// @lc code=start
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int balance = 0;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                if(balance>0){
                    sb.append(c);
                }
                balance++;
            }
            else{
                balance--;
                if(balance>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
// @lc code=end

